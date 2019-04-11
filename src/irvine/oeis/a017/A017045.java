package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017045 <code>a(n) = (7*n + 5)^5</code>.
 * @author Sean A. Irvine
 */
public class A017045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017045() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 248832, 2476099, 11881376, 39135393, 102400000});
  }
}
