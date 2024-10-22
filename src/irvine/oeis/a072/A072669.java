package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072669 Primes of the form prime(x) + prime(x+1) - 1.
 * @author Sean A. Irvine
 */
public class A072669 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z q = mP;
      mP = super.next();
      final Z t = mP.add(q).subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
