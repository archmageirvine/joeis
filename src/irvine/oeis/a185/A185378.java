package irvine.oeis.a185;

import irvine.math.z.Z;

/**
 * A185378 Number of binary necklaces of 2n beads that are identical when turned over yet cannot be cut to produce a palindrome.
 * @author Gregory Morse
 */
public class A185378 extends A185376 {
  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final long n) {
    // Twice the bracelet count minus the necklace count counts reflection-symmetric necklaces.
    return Z.THREE.shiftLeft(n - 1).subtract(palindromes(2 * n));
  }
}
