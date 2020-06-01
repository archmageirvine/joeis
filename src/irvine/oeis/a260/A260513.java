package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260513 <code>a(n) = (8*n+13*n^3+3*n^5)/24;</code> also the sum of triangular numbers taken in successive groups of increasing size (see Example).
 * @author Sean A. Irvine
 */
public class A260513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260513() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 9, 46, 164, 460, 1091});
  }
}
