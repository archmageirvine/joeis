package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222465 <code>a(n) = 4*n^2 + 3</code>.
 * @author Sean A. Irvine
 */
public class A222465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222465() {
    super(new long[] {1, -3, 3}, new long[] {3, 7, 19});
  }
}
