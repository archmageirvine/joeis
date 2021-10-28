package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a031.A031924;

/**
 * A052159 Lower prime of a difference of 6 (G-minor-6 primes) between consecutive primes of 6k+5 form.
 * @author Sean A. Irvine
 */
public class A052159 extends A031924 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(6) == 5) {
        return p;
      }
    }
  }
}
