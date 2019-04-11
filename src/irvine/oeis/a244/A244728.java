package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244728 <code>a(n) = 9*n^3</code>.
 * @author Sean A. Irvine
 */
public class A244728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244728() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 9, 72, 243});
  }
}
