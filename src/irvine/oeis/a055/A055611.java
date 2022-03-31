package irvine.oeis.a055;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055611 n written efficiently in natural numbers base, i.e., in form ...wxyz where n = 1*z + 2*y + 3*x + 4*w + ... with z &lt;= 1, y &lt; 2, x &lt; 3, w &lt; 4, ...
 * @author Sean A. Irvine
 */
public class A055611 implements Sequence {

  private long mN = 0;
  private int mK = 1;
  private long mLim = 2;
  private final ArrayList<Long> mLimits = new ArrayList<>();
  {
    mLimits.add(1L);
    mLimits.add(2L);
  }

  @Override
  public Z next() {
    long m = ++mN;
    if (mN >= mLim) {
      ++mK;
      mLim += (mK - 1L) * mK;
      mLimits.add(mLim);
    }
    Z res = Z.ZERO;
    long mul = 10;
    for (int k = mK; k > 0; --k) {
      long digit = 0;
      while (m - k * digit >= mLimits.get(k - 1)) {
        if (++digit >= mul) {
          mul *= 10;
        }
      }
      m -= digit * k;
      res = res.multiply(mul).add(digit);
    }
    return res;
  }
}
