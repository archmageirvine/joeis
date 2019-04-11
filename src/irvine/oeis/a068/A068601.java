package irvine.oeis.a068;

import irvine.oeis.LinearRecurrence;

/**
 * A068601 <code>a(n) = n^3 - 1</code>.
 * @author Sean A. Irvine
 */
public class A068601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A068601() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 26, 63});
  }
}
