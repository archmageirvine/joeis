package irvine.oeis.a019;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019505 a(1)=1; for n &gt; 1, a(n) is the smallest number with the same number of divisors as 2*a(n-1).
 * @author Sean A. Irvine
 */
public class A019505 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final long sigma0 = mFactor.factorize(mA.multiply2()).sigma0AsLong();
      do {
        mA = mA.add(1);
      } while (mFactor.factorize(mA).sigma0AsLong() != sigma0);
    }
    return mA;
  }
}
