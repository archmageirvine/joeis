package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028985 Nonsquare palindromes whose sum of divisors is odd.
 * @author Sean A. Irvine
 */
public class A028985 extends A028984 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      p.sqrt();
      if (p.auxiliary() == 0) {
        return p;
      }
    }
  }
}
