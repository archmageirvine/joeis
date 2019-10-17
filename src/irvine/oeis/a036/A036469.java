package irvine.oeis.a036;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000009;

/**
 * A036469 Partial sums of <code>A000009</code> (partitions into distinct parts).
 * @author Sean A. Irvine
 */
public class A036469 extends PartialSumSequence {

  /** Construct the sequence. */
  public A036469() {
    super(new A000009());
  }
}
