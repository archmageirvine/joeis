package irvine.oeis.a022;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A022995 a(n) = 39 - n.
 * @author Sean A. Irvine
 */
public class A022995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022995() {
    super(new long[] {-1, 2}, new long[] {39, 38});
  }
}
