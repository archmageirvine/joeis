package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A028984 Palindromes whose sum of divisors is odd.
 * @author Sean A. Irvine
 */
public class A028984 extends A002113 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (!Cheetah.factor(p).sigma().isEven()) {
        return p;
      }
    }
  }
}
