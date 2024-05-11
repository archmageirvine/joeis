package irvine.oeis.a002;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002779 Palindromic squares.
 * @author Sean A. Irvine
 */
public class A002779 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      if (Predicates.PALINDROME.is(n2)) {
        return n2;
      }
    }
  }
}
