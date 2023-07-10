package irvine.oeis.a354;

import irvine.math.z.Z;

/**
 * A354542 Primes in A354543.
 * @author Georg Fischer
 */
public class A354542 extends A354543 {

  @Override
  public Z next() {
    while (true) {
      final Z result = super.next();
      if (result.isProbablePrime()) {
        return result;
      }
    }
  }
}
