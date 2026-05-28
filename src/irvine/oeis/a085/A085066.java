package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085066 a(1) = 6, a(n) = smallest number of the form k*a(n-1) +1 with the same prime signature p*q (6 = 2*3), where p and q are primes.
 * @author Sean A. Irvine
 */
public class A085066 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
    } else {
      long k = 0;
      while (true) {
        final Z t = mA.multiply(++k).add(1);
        if (!Predicates.SQUARE.is(t) && Predicates.SEMIPRIME.is(t)) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
