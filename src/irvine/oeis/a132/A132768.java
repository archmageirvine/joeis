package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132768 a(n) = n*(n + 26).
 * @author Sean A. Irvine
 */
public class A132768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132768() {
    super(new long[] {1, -3, 3}, new long[] {0, 27, 56});
  }
}
