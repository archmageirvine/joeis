package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002847 Number of ways of getting a straight flush, 4 of a kind, full house, flush, straight, 3 of a kind, 2 pair, a pair, no pair in poker.
 * @author Sean A. Irvine
 */
public class A002847 extends FiniteSequence {

  /** Construct the sequence. */
  public A002847() {
    super(1, FINITE, 40, 624, 3744, 5108, 10200, 54912, 123552, 1098240, 1302540);
  }
}

