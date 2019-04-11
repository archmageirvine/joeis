package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244725 <code>a(n) = 5*n^3</code>.
 * @author Sean A. Irvine
 */
public class A244725 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244725() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 40, 135});
  }
}
