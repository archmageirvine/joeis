package irvine.oeis.a019;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019505 <code>a(n)</code> is smallest number with same number of divisors as <code>2*a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A019505 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final long sigma0 = mFactor.factorize(mA.multiply2()).sigma0();
      do {
        mA = mA.add(1);
      } while (mFactor.factorize(mA).sigma0() != sigma0);
    }
    return mA;
  }
}
