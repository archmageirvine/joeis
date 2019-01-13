package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028116.
 * @author Sean A. Irvine
 */
public class A028116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028116() {
    super(new long[] {-1260, 887, -227, 25}, new long[] {1, 25, 398, 5162});
  }
}
