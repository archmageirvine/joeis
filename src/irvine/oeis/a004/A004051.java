package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004051 Primes of the form <code>2^a + 3^b</code>.
 * @author Sean A. Irvine
 */
public class A004051 extends A004050 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}
