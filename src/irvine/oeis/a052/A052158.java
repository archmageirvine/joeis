package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a031.A031924;

/**
 * A052158 Lower prime of a difference of 6 (G-minor-6 primes) between consecutive primes of 6k+1 form.
 * @author Sean A. Irvine
 */
public class A052158 extends A031924 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(6) == 1) {
        return p;
      }
    }
  }
}
