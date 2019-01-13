package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168277.
 * @author Sean A. Irvine
 */
public class A168277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168277() {
    super(new long[] {-1, 1, 1}, new long[] {1, 1, 5});
  }
}
