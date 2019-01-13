package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079960.
 * @author Sean A. Irvine
 */
public class A079960 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079960() {
    super(new long[] {1, 1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 9});
  }
}
