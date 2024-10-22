package irvine.oeis.a072;

import irvine.oeis.PartialSumSequence;

/**
 * A072720 Number of partitions of n into parts which are each powers of a single number (which may vary between partitions).
 * @author Sean A. Irvine
 */
public class A072720 extends PartialSumSequence {

  /** Construct the sequence. */
  public A072720() {
    super(0, new A072721());
  }
}
