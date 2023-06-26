package irvine.oeis.a002;

import irvine.oeis.FiniteSequence;

/**
 * A002761 Number of ways of getting a royal flush, other straight flush, 4 of a kind, full house, other flush, other straight, 3 of a kind, 2 pair, a pair or nothing in 5-card poker.
 * @author Sean A. Irvine
 */
public class A002761 extends FiniteSequence {

  /** Construct the sequence. */
  public A002761() {
    super(1, FINITE, 4, 36, 624, 3744, 5108, 10200, 54912, 123552, 1098240, 1302540);
  }
}

