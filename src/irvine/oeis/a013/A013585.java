package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013585 Smallest m such that <code>1!+...+m!</code> is divisible by <code>2n+1</code>, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A013585 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;
  private final ArrayList<Z> mFactorialSum = new ArrayList<>();
  {
    mFactorialSum.add(Z.ZERO);
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN <= 3) {
      return Z.valueOf((mN + 1) / 2);
    }
    for (int m = 1; m < mN; ++m) {
      if (m >= mFactorialSum.size()) {
        mF = mF.multiply(m);
        mFactorialSum.add(mFactorialSum.get(mFactorialSum.size() - 1).add(mF));
      }
      if (mFactorialSum.get(m).mod(mN) == 0) {
        return Z.valueOf(m);
      }
    }
    return Z.ZERO;
  }
}
