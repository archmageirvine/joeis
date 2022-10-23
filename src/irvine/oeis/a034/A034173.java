package irvine.oeis.a034;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034173 a(n) is minimal such that prime factorizations of a(n), ..., a(n)+n-1 have same exponents.
 * @author Sean A. Irvine
 */
public class A034173 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;
  private long mS = 1;
  private int[] mPrev = new int[0];

  @Override
  public Z next() {
    ++mN;
    int c = 0;
    while (c < mN) {
      final FactorSequence fs = Jaguar.factor(++mM);
      final Z[] p = fs.toZArray();
      final int[] exponents = new int[p.length];
      for (int k = 0; k < p.length; ++k) {
        exponents[k] = fs.getExponent(p[k]);
      }
      Arrays.sort(exponents);
      if (Arrays.equals(exponents, mPrev)) {
        ++c;
      } else {
        mPrev = exponents;
        mS = mM;
        c = 1;
      }
    }
    return Z.valueOf(mS);
  }
}

