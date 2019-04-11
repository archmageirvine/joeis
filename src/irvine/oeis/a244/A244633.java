package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244633 <code>a(n) = 26*n^2</code>.
 * @author Sean A. Irvine
 */
public class A244633 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244633() {
    super(new long[] {1, -3, 3}, new long[] {0, 26, 104});
  }
}
