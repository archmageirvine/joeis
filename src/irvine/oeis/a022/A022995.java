package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022995 39-n.
 * @author Sean A. Irvine
 */
public class A022995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022995() {
    super(new long[] {-1, 2}, new long[] {39, 38});
  }
}
