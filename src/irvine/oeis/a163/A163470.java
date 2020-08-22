package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163470 a(n) = 8*a(n-1) - 13*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 15.
 * @author Sean A. Irvine
 */
public class A163470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163470() {
    super(new long[] {-13, 8}, new long[] {3, 15});
  }
}
