package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212699 Main transitions in systems of n particles with spin 2.
 * @author Sean A. Irvine
 */
public class A212699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212699() {
    super(new long[] {-25, 10}, new long[] {4, 40});
  }
}
