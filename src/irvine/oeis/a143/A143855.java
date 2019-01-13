package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143855.
 * @author Sean A. Irvine
 */
public class A143855 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143855() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 51});
  }
}
