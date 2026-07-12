package irvine.oeis.a085;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A085826 Continued fraction expansion of number defined in A085825.
 * @author Sean A. Irvine
 */
public class A085826 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A085826() {
    super(0, new A085825());
  }
}
