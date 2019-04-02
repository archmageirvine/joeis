package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a015.A015919;

/**
 * A006935 Even pseudoprimes (or primes) to base 2: even n that divide 2^n - 2.
 * @author Sean A. Irvine
 */
public class A006935 extends A015919 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isEven()) {
        return n;
      }
    }
  }
}
