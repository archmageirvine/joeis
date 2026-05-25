package irvine.oeis.a084;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A084992 Palindromes such that the difference between the consecutive terms are palindromes and this has not been the difference of any two consecutive terms earlier.
 * @author Sean A. Irvine
 */
public class A084992 extends Sequence1 {

  private final Sequence mPalindromes = new A002113().skip();
  private final HashSet<Z> mSeenDiffs = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = mPalindromes.next();
      return mA;
    }
    final Z prev = mA;
    while (true) {
      mA = mPalindromes.next();
      final Z d = mA.subtract(prev);
      if (Predicates.PALINDROME.is(d) && mSeenDiffs.add(d)) {
        return mA;
      }
    }
  }
}
