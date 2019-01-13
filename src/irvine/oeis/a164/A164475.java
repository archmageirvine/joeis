package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164475.
 * @author Sean A. Irvine
 */
public class A164475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164475() {
    super(new long[] {-1, -1, 2, 0, 1}, new long[] {13, 20, 30, 44, 63});
  }
}
