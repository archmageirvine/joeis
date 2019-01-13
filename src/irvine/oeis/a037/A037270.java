package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037270.
 * @author Sean A. Irvine
 */
public class A037270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037270() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 10, 45, 136});
  }
}
