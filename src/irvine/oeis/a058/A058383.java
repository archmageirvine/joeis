package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a033.A033845;

/**
 * A058383 Primes of form 1+(2^a)*(3^b), a&gt;0, b&gt;0.
 * @author Sean A. Irvine
 */
public class A058383 extends A033845 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

