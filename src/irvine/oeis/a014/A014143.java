package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014143 Partial sums of A014138.
 * @author Sean A. Irvine
 */
public class A014143 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014143() {
    super(new A014138().skip(1));
  }
}
