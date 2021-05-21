package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a023.A023196;

/**
 * A047779 Abundant or perfect numbers k such that neither k-1 nor k+1 is a prime.
 * @author Sean A. Irvine
 */
public class A047779 extends A023196 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!t.subtract(1).isProbablePrime() && !t.add(1).isProbablePrime()) {
        return t;
      }
    }
  }
}
