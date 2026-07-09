package irvine.oeis.a085;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a086.A086450;

/**
 * A085765 Partial sums and bisection of A086450.
 * @author Sean A. Irvine
 */
public class A085765 extends PartialSumSequence {

  /** Construct the sequence. */
  public A085765() {
    super(0, new A086450());
  }
}
