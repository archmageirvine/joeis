package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069784 Numbers m such that gcd(d((m!)^3), d(m!)) <code>= 2^k, i</code>.e., is a power of 2; d = A000005.
 * @author Georg Fischer
 */
public class A069784 extends FiniteSequence {

  /** Construct the sequence. */
  public A069784() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 18, 19, 30, 31, 32, 35, 38, 39);
  }
}
