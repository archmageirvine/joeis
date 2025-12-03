package irvine.oeis.a082;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A082273 Palindromes arising in A082272.
 * @author Sean A. Irvine
 */
public class A082273 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z lim = Z.valueOf(mN).square();
    final Sequence palindromes = new A002113().skip();
    while (true) {
      final Z p = palindromes.next();
      final Z t = p.add(mN);
      if (Predicates.PALINDROME.is(t)) {
        return t;
      }
      if (p.compareTo(lim) > 0) {
        return Z.ZERO;
      }
    }
  }
}
