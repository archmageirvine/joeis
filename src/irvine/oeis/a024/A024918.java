package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000961;

/**
 * A024918 Partial sums of the sequence of prime powers <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A024918 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024918() {
    super(new A000961());
  }
}
