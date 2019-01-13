package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168071.
 * @author Sean A. Irvine
 */
public class A168071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168071() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 1, -2, -5});
  }
}
