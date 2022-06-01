package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164743 Digital root of 3*A000045(n).
 * @author Sean A. Irvine
 */
public class A164743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164743() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 3, 6, 9, 6, 6, 3, 9});
  }
}
