package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164576.
 * @author Sean A. Irvine
 */
public class A164576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164576() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 11, 20, 46, 63});
  }
}
