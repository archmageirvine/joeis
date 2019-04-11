package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131132 <code>a(n) = a(n-1) + a(n-2) + 1</code> if n is a multiple of <code>6,</code> otherwise <code>a(n) = a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A131132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131132() {
    super(new long[] {-1, -1, 1, 0, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5, 8, 14, 22});
  }
}
