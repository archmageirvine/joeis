package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a027.A027571;

/**
 * A050239 Consecutive square palindromic primes; palindromic primes of the form x^2 + (x+1)^2, where x values are given by A050236.
 * @author Sean A. Irvine
 */
public class A050239 extends A027571 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      final Z palin = t.square().add(t.add(1).square());
      if (palin.isProbablePrime()) {
        return palin;
      }
    }
  }
}
