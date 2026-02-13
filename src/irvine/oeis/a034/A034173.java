package irvine.oeis.a034;

import irvine.factor.util.FactorUtils;
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
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    int c = 0;
    while (c < mN) {
      final Z signature = FactorUtils.leastPrimeSignature(++mM);
      if (signature.equals(mPrev)) {
        ++c;
      } else {
        mPrev = signature;
        mS = mM;
        c = 1;
      }
    }
    return Z.valueOf(mS);
  }
}

