package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180666.
 * @author Sean A. Irvine
 */
public class A180666 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180666() {
    super(new long[] {1, -2, -2, 1, -1, 2, 2}, new long[] {0, 1, 2, 6, 15, 41, 106});
  }
}
