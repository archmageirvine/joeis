package irvine.oeis.a185;

import irvine.math.z.Z;

/**
 * A185376 Number of binary necklaces of 2n beads for which a cut exists producing a palindrome.
 * @author Gregory Morse
 */
public class A185376 extends A185333 {
  private long mN = 0;

  @Override
  public Z next() {
    return palindromes(2 * ++mN);
  }

  @Override
  public Z a(final long n) {
    return palindromes(2 * n);
  }
}
