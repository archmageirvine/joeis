package irvine.oeis.a042;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A042978 Stern primes: primes not of the form p + 2b^2 for p prime and b &gt; 0.
 * @author Sean A. Irvine
 */
public class A042978 extends A000040 {

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z p = super.next();
      Z b = Z.ONE;
      Z q;
      while ((q = p.subtract(b.square().multiply2())).signum() > 0) {
        if (q.isProbablePrime()) {
          continue outer;
        }
        b = b.add(1);
      }
      return p;
    }
  }
}
