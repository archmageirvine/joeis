package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110331.
 * @author Sean A. Irvine
 */
public class A110331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110331() {
    super(new long[] {1, -3, 3}, new long[] {1, -1, -5});
  }
}
