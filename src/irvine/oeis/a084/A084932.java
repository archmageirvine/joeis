package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A084932 Primes corresponding to A084931.
 * @author Sean A. Irvine
 */
public class A084932 extends A002808 {

  private Z mRecord = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      Z m = n;
      Z prev;
      do {
        prev = m;
        m = Functions.SOPFR.z(m);
      } while (!m.isZero() && !prev.equals(m));
      if (n.mod(m).isZero() && m.isProbablePrime() && m.compareTo(mRecord) > 0) {
        mRecord = m;
        return m;
      }
    }
  }
}

