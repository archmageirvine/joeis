package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a049.A049407;

/**
 * A057683 Numbers k such that k^2 + k + 1, k^3 + k + 1 and k^4 + k + 1 are all prime.
 * @author Sean A. Irvine
 */
public class A057683 extends A049407 {

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (k.pow(4).add(k).add(1).isProbablePrime() && k.square().add(k).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}
