package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022279 <code>a(n) = n*(21*n + 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A022279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022279() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 43});
  }
}
