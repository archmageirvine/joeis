package irvine.oeis.a034;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034174 a(n) is minimal such that prime factorizations of a(n)-n+1, ..., a(n) have same exponents.
 * @author Sean A. Irvine
 */
public class A034174 implements Sequence {

  private int mN = 0;
  private long mM = 0;
  private int[] mPrev = new int[0];

  @Override
  public Z next() {
    ++mN;
    int c = 0;
    while (c < mN) {
      final FactorSequence fs = Cheetah.factor(++mM);
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
        c = 1;
      }
    }
    return Z.valueOf(mM);
  }
}

