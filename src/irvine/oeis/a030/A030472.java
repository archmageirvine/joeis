package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030472 Primes which when concatenated with next 3 primes are also prime.
 * @author Sean A. Irvine
 */
public class A030472 extends A000040 {

  private Z mP0 = super.next();
  private Z mP1 = super.next();
  private Z mP2 = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP0;
      mP0 = mP1;
      mP1 = mP2;
      mP2 = super.next();
      if (new Z(t.toString() + mP0 + mP1 + mP2).isProbablePrime()) {
        return t;
      }
    }
  }
}
