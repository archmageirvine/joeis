package irvine.oeis.a030;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030074 Squares which are palindromes in base 14.
 * @author Sean A. Irvine
 */
public class A030074 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = mN.square();
      if (Predicates.PALINDROME.is(14, s)) {
        return s;
      }
    }
  }
}
