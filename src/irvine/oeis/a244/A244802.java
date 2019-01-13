package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244802.
 * @author Sean A. Irvine
 */
public class A244802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244802() {
    super(new long[] {1, -3, 3}, new long[] {1, 10, 43});
  }
}
