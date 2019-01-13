package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102091.
 * @author Sean A. Irvine
 */
public class A102091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102091() {
    super(new long[] {1, -5, 5}, new long[] {12, 32, 108});
  }
}
