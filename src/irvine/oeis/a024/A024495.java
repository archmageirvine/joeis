package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024495 <code>a(n) =</code> C(n,2) + C(n,5) <code>+ </code>... + C(n, <code>3*floor(n/3)+2)</code>.
 * @author Sean A. Irvine
 */
public class A024495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024495() {
    super(new long[] {2, -3, 3}, new long[] {0, 0, 1});
  }
}
