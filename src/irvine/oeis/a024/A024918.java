package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000961;

/**
 * A024918 Partial sums of the sequence of prime powers (A000961).
 * @author Sean A. Irvine
 */
public class A024918 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024918() {
    super(1, new A000961());
  }
}
