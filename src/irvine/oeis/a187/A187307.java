package irvine.oeis.a187;

import irvine.oeis.LinearRecurrence;

/**
 * A187307 Hankel transform of <code>an</code> alternating sum of Motzkin numbers.
 * @author Sean A. Irvine
 */
public class A187307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A187307() {
    super(new long[] {-1, 2, -3, 2}, new long[] {1, 2, 2, -1});
  }
}
