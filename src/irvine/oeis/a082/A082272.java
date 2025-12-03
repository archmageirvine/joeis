package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082272 Smallest palindrome m such that n + m (m&gt;0) is also a palindrome, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A082272 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z lim = Z.valueOf(mN).square();
    final Sequence palindromes = new A002113().skip();
    while (true) {
      final Z p = palindromes.next();
      if (Predicates.PALINDROME.is(p.add(mN))) {
        return p;
      }
      if (p.compareTo(lim) > 0) {
        return Z.ZERO;
      }
    }
  }
}
