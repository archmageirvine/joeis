package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093917 <code>a(n) = n^3+n</code> for odd n, <code>(n^3+n)*3/2</code> for even n: Row sums of <code>A093915</code>.
 * @author Sean A. Irvine
 */
public class A093917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093917() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 15, 30, 102, 130, 333, 350, 780});
  }
}
