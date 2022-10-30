package irvine.oeis.a054;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000002;

/**
 * A054353 Partial sums of Kolakoski sequence A000002.
 * @author Sean A. Irvine
 */
public class A054353 extends PartialSumSequence {

  /** Construct the sequence. */
  public A054353() {
    super(1, new A000002());
  }
}
