package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084569.
 * @author Sean A. Irvine
 */
public class A084569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084569() {
    super(new long[] {1, -4, 5, 0, -5, 4}, new long[] {1, 3, 9, 21, 44, 82});
  }
}
