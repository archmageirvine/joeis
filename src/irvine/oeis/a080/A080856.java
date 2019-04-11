package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080856 <code>a(n) = 8*n^2 - 4*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A080856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080856() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 25});
  }
}
