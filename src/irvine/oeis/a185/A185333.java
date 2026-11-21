package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A185333 Number of binary necklaces of n beads for which a cut exists producing a palindrome.
 * @author Gregory Morse
 */
public class A185333 extends LambdaSequence {
  /** Construct the sequence. */
  public A185333() {
    super(1, A185333::palindromes);
  }

  protected static Z palindromes(final long n) {
    if ((n & 1) != 0) {
      return Z.ONE.shiftLeft((n + 1) / 2);
    }
    // Odd-period necklaces have one palindromic cut, even-period ones have two.
    final long odd = n >> Long.numberOfTrailingZeros(n);
    return Z.ONE.shiftLeft(n / 2 - 1).add(Z.ONE.shiftLeft((odd - 1) / 2));
  }
}
