package irvine.oeis.a164;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A164304 a(n) = 4*a(n-1) - 2*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 14.
 * @author Sean A. Irvine
 */
public class A164304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164304() {
    super(new long[] {-2, 4}, new long[] {3, 14});
  }
}
