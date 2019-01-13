package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026055.
 * @author Sean A. Irvine
 */
public class A026055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026055() {
    super(new long[] {-1, 3, -3, 1, 1, -3, 3}, new long[] {6, 14, 25, 40, 59, 84, 114});
  }
}
