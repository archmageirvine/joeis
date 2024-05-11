package irvine.oeis.a164;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A164861 Odd positive integers that are not palindromes when written in binary.
 * @author Georg Fischer
 */
public class A164861 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    while (Predicates.PALINDROME.is(2, mN)) {
      mN += 2;
    }
    return Z.valueOf(mN);
  }
}
