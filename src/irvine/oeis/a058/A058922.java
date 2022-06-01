package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058922 a(n) = n*2^n - 2^n.
 * @author Sean A. Irvine
 */
public class A058922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058922() {
    super(new long[] {-4, 4}, new long[] {0, 4});
  }
}
