package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087464 Generalized multiplicative Jacobsthal sequence.
 * @author Sean A. Irvine
 */
public class A087464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087464() {
    super(new long[] {8, 0, 0, 7, 0, 0}, new long[] {0, 0, 2, 0, 6, 10});
  }
}
