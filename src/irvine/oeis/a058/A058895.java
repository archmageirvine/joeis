package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058895 <code>a(n) = n^4 - n</code>.
 * @author Sean A. Irvine
 */
public class A058895 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058895() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 14, 78, 252});
  }
}
