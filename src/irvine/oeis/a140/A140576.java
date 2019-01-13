package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140576.
 * @author Sean A. Irvine
 */
public class A140576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140576() {
    super(new long[] {-9, 9, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5, 6, 7, 8});
  }
}
