package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015220.
 * @author Sean A. Irvine
 */
public class A015220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015220() {
    super(new long[] {-1, 1, 0, 3, -3, 0, -3, 3, 0, 1}, new long[] {4, 10, 20, 56, 84, 120, 220, 286, 364, 560});
  }
}
