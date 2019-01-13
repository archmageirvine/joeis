package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180223.
 * @author Sean A. Irvine
 */
public class A180223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180223() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 15});
  }
}
