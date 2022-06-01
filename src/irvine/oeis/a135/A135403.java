package irvine.oeis.a135;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A135403 a(n) = 1 + 111110*n.
 * @author Sean A. Irvine
 */
public class A135403 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135403() {
    super(new long[] {-1, 2}, new long[] {1, 111111});
  }
}
