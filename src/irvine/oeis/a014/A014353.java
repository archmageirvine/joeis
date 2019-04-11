package irvine.oeis.a014;

import irvine.oeis.FiniteSequence;

/**
 * A014353 Chance of getting nothing, a pair, 2 pair, 3 of a kind, other straight, other flush, full house, 4 of a kind, other straight flush, or a royal flush in poker is 1 in <code>a(n)</code> (rounded to nearest integer).
 * @author Sean A. Irvine
 */
public class A014353 extends FiniteSequence {

  /** Construct the sequence. */
  public A014353() {
    super(2, 2, 21, 47, 255, 509, 694, 4165, 72193, 649740);
  }
}

