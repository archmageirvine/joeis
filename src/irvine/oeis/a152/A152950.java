package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152950 <code>a(n) = 3 + n*(n-1)/2</code>.
 * @author Sean A. Irvine
 */
public class A152950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152950() {
    super(new long[] {1, -3, 3}, new long[] {3, 4, 6});
  }
}
