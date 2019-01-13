package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195033.
 * @author Sean A. Irvine
 */
public class A195033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195033() {
    super(new long[] {-1, 0, 2, 0}, new long[] {21, 20, 42, 40});
  }
}
