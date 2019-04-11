package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058212 <code>a(n) = 1 + floor(n*(n-3)/6)</code>.
 * @author Sean A. Irvine
 */
public class A058212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058212() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 0, 0, 1, 1});
  }
}
