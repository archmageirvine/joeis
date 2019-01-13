package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037614.
 * @author Sean A. Irvine
 */
public class A037614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037614() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 10, 72, 505});
  }
}
