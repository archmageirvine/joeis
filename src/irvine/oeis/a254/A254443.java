package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254443.
 * @author Sean A. Irvine
 */
public class A254443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254443() {
    super(new long[] {1, -1, -20, 20, 1}, new long[] {35, 75, 911, 1707, 18383});
  }
}
