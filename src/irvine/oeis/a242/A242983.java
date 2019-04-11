package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242983 <code>n/2 * (n^3 - 2*n^2 - 2*n + 5)</code>.
 * @author Sean A. Irvine
 */
public class A242983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242983() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 1, 12, 58});
  }
}
