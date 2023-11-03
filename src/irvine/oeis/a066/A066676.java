package irvine.oeis.a066;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A066676 Smallest number m such that phi(m) is a multiple of n-th primorial number, the product of first n primes.
 * @author Sean A. Irvine
 */
public class A066676 extends Sequence1 {

  // After Ray Chandler

  private final PrimeDivision mFactor = new PrimeDivision();
  private final Sequence mP = new A002110().skip();

  @Override
  public Z next() {
    final Z pm = mP.next();
    if (pm.add(1).isProbablePrime()) {
      return pm.add(1);
    } else {
      final Z halfPrimorial = pm.divide2();
      final Z s = halfPrimorial.sqrt();
      for (final Z d : mFactor.factorize(halfPrimorial).divisorsSorted()) {
        if (d.compareTo(s) < 0) {
          continue;
        }
        final Z e = halfPrimorial.divide(d);
        final Z d2 = d.multiply2().add(1);
        if (d2.isProbablePrime() && e.multiply2().add(1).isProbablePrime()) {
          return d2.multiply(e.multiply2().add(1));
        }
      }
    }
    throw new RuntimeException();
  }
}
