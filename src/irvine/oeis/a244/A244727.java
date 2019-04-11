package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244727 <code>a(n) = 7*n^3</code>.
 * @author Sean A. Irvine
 */
public class A244727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244727() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 56, 189});
  }
}
