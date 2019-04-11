package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087551 Start of the second run of n successive primes which have the same successive differences as the prime sequence <code>(7,11,13,17,19,23,29,31,37,41,43,</code>...) beginning with 7. The first differences are <code>4,2,4,2,4,6,2,6,4,2,4,6,6,2,6,4,2,</code>...
 * @author Georg Fischer
 */
public class A087551 extends FiniteSequence {

  /** Construct the sequence. */
  public A087551() {
    super(11, 13, 13, 13, 97, 97);
  }
}
