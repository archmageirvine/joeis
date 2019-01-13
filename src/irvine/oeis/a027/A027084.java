package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027084.
 * @author Sean A. Irvine
 */
public class A027084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027084() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 3, 7, 14});
  }
}
