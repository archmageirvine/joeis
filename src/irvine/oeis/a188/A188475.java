package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188475 <code>a(n) = (2*n^3 + 3*n^2 + n + 3)/3</code>.
 * @author Sean A. Irvine
 */
public class A188475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188475() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 11, 29});
  }
}
