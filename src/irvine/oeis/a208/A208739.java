package irvine.oeis.a208;
// manually diffs/diffseq at 2024-02-27 21:31

import irvine.oeis.DifferenceSequence;

/**
 * A208739 2^n minus the number of partitions of n.
 * @author Georg Fischer
 */
public class A208739 extends DifferenceSequence {

  /** Construct the sequence. */
  public A208739() {
    super(0, new A208738());
  }
}
