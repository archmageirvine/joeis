package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a015.A015919;

/**
 * A006935 Even pseudoprimes (or primes) to base <code>2</code>: even n that divide <code>2^n - 2</code>.
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
