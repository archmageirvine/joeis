package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084843 Numbers n such that no palindrome m &gt; 0 exists with n + m also a palindrome.
 * @author Sean A. Irvine
 */
public class A084843 extends Sequence1 implements Conjectural {

  private long mN = 918;

  private boolean is(final long n) {
    final Sequence palin = new A002113().skip();
    while (true) {
      final Z p = palin.next();
      if (Predicates.PALINDROME.is(p.add(n))) {
        return false;
      }
      if (Functions.DIGIT_LENGTH.i(p) > 2 * Functions.DIGIT_LENGTH.i(n)) {
        return true;
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
