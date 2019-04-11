package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058922 <code>a(n) = n*2^n - 2^n</code>.
 * @author Sean A. Irvine
 */
public class A058922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058922() {
    super(new long[] {-4, 4}, new long[] {0, 4});
  }
}
