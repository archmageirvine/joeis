package irvine.oeis.a060;

import irvine.oeis.FiniteSequence;

/**
 * A060342 Smallest prime simultaneously the sum of two, three, ..., n consecutive composite numbers.
 * @author Georg Fischer
 */
public class A060342 extends FiniteSequence {

  /** Construct the sequence. */
  public A060342() {
    super(2, FINITE, 17, 31, 311, 17783);
  }
}
