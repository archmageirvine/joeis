package irvine.oeis.a029;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029736 Palindromic cubes in base 16.
 * @author Sean A. Irvine
 */
public class A029736 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.pow(3);
      if (Predicates.PALINDROME.is(16, t)) {
        return t;
      }
    }
  }
}
