package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161712 <code>a(n) = (4*n^3 - 6*n^2 + 8*n + 3)/3</code>.
 * @author Sean A. Irvine
 */
public class A161712 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161712() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 9, 27});
  }
}
