package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036493 Largest number having binary order n (A029837) and of which the number of divisors is maximal in that range of g(k) = n.
 * @author Sean A. Irvine
 */
public class A036493 implements Sequence {

  private Z mLim = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    Z sigma0 = Z.ZERO;
    Z bestA = Z.ZERO;
    while (mA.compareTo(mLim) <= 0) {
      final FactorSequence fs = Jaguar.factor(mA);
      final Z s = fs.sigma0();
      if (s.compareTo(sigma0) >= 0) {
        sigma0 = s;
        bestA = mA;
      }
      mA = mA.add(1);
    }
    return bestA;
  }
}

