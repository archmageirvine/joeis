package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070742 a(n) = index of the (presumably) last palindrome in the 'Reverse and Add' trajectory of n, or -1 if this number is not finite, or 0 if no palindrome exists.
 * @author Sean A. Irvine
 */
public class A070742 extends Sequence1 {

  private static final long HEURISTIC = 1000; // Distance since last palindrome
  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long lastPalindromIndex = 0;
    long k = 1;
    long j = 0;
    while (true) {
      ++k;
      t = Functions.REVERSE_AND_ADD.z(t);
      if (Predicates.PALINDROME.is(t)) {
        lastPalindromIndex = k;
        j = 0;
      } else if (++j == HEURISTIC) {
        break;
      }
    }
    return Z.valueOf(lastPalindromIndex);
  }
}
