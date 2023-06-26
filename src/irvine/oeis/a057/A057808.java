package irvine.oeis.a057;

import irvine.oeis.FiniteSequence;

/**
 * A057808 Number of ways of getting (at least) a straight flush, 4 of a kind, full house, flush, straight, 3 of a kind, 2 pair, a pair in poker.
 * @author Georg Fischer
 */
public class A057808 extends FiniteSequence {

  /** Construct the sequence. */
  public A057808() {
    super(1, FINITE, 40, 624, 3744, 5148, 10240, 54280, 127920, 1281072);
  }
}
