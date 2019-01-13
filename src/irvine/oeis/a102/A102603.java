package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102603.
 * @author Sean A. Irvine
 */
public class A102603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102603() {
    super(new long[] {-1, 2}, new long[] {21, 45});
  }
}
