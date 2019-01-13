package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102436.
 * @author Sean A. Irvine
 */
public class A102436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102436() {
    super(new long[] {-1, 4, 6}, new long[] {1, 5, 34});
  }
}
