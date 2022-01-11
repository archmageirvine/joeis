package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.a031.A031443;

/**
 * A087510 Primes consisting only of digits 0 and 1 occurring with equal frequency.
 * @author Georg Fischer
 */
public class A087510 extends A031443 {

  @Override
  public Z next() {
    while (true) {
      final Z cand = new Z(super.next().toString(2));
      if (cand.isProbablePrime()) {
        return cand;
      }
    }
  }
}
