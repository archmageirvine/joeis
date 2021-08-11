package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a027.A027571;

/**
 * A050236 Indices of consecutive squares palindromic primes; x such that x^2 + (x+1)^2 is palindromic and prime.
 * @author Sean A. Irvine
 */
public class A050236 extends A027571 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z palin = t.square().add(t.add(1).square());
      if (palin.isProbablePrime()) {
        return t;
      }
    }
  }
}
