package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102207.
 * @author Sean A. Irvine
 */
public class A102207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102207() {
    super(new long[] {1, -5, 5}, new long[] {4, 17, 65});
  }
}
