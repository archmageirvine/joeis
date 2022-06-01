package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164305 a(n) = 6*a(n-1) - 7*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 17.
 * @author Sean A. Irvine
 */
public class A164305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164305() {
    super(new long[] {-7, 6}, new long[] {3, 17});
  }
}
