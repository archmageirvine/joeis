package irvine.oeis.a008;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000073;

/**
 * A008937.
 * @author Sean A. Irvine
 */
public class A008937 extends PartialSumSequence {

  /** Construct the sequence. */
  public A008937() {
    super(new SkipSequence(new A000073(), 1));
  }
}
