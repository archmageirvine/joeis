package irvine.oeis.a002;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002781 Palindromic cubes.
 * @author Sean A. Irvine
 */
public class A002781 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n3 = mN.pow(3);
      if (Predicates.PALINDROME.is(n3)) {
        return n3;
      }
    }
  }
}
