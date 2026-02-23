package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083837 Smallest palindrome n such that kn + 1 is a palindrome, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083837 extends Sequence1 {

  private static final Z LIMIT = Z.TEN.pow(15);
  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Sequence palins = new A002113().skip();
    while (true) {
      final Z p = palins.next();
      if (p.compareTo(LIMIT) >= 0) {
        return Z.ZERO;
      }
      final Z t = n.multiply(p).add(1);
      if (Predicates.PALINDROME.is(t)) {
        return p;
      }
    }
  }
}
