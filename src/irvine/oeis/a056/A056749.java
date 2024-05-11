package irvine.oeis.a056;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a006.A006995;

/**
 * A056749 Smallest palindrome greater than n in bases 2 and n.
 * @author Sean A. Irvine
 */
public class A056749 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Sequence binaryPalindromes = new A006995();
    while (true) {
      final Z palin = binaryPalindromes.next();
      if (palin.compareTo(n) > 0 && Predicates.PALINDROME.is(mN, palin)) {
        return palin;
      }
    }
  }
}
