package irvine.oeis.a141;

import irvine.oeis.FiniteSequence;

/**
 * A141340 Positive integers n such that A061358(n) = #{primes p | <code>n/2 &lt;=</code> p <code>&lt; n-1}</code>.
 * @author Georg Fischer
 */
public class A141340 extends FiniteSequence {

  /** Construct the sequence. */
  public A141340() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 18, 24, 30, 36, 42, 48, 60, 90, 210);
  }
}
