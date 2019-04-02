package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163472 a(n) = 12*a(n-1) - 33*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 21.
 * @author Sean A. Irvine
 */
public class A163472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163472() {
    super(new long[] {-33, 12}, new long[] {3, 21});
  }
}
