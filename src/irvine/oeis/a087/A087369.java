package irvine.oeis.a087;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087369 Smallest palindromic square multiple of the n-th palindrome.
 * @author Sean A. Irvine
 */
public class A087369 extends Sequence1 {

  private long mN = 0;

  private boolean isPalindrome(final Z n) {
    // Square palindromes can only end in 1, 4, 5, 6, or 9
    final long lastDigit = n.mod(10);
    return !(lastDigit == 0 || lastDigit == 2 || lastDigit == 3 || lastDigit == 7 || lastDigit == 8) && Predicates.PALINDROME.is(n);
  }

  @Override
  public Z next() {
    // This may not be the most efficient approach to this sequence, but
    // want to make sure it is right.  Simple is best here.

    // Step to next palindrome
    do {
      ++mN;
    } while (!Predicates.PALINDROME.is(mN));

    // Test each possible square in turn
    long k = 1;
    while (true) {
      final Z kk = Z.valueOf(k++).square();
      if (kk.mod(mN) == 0 && isPalindrome(kk)) {
        return kk;
      }
    }
  }
}

