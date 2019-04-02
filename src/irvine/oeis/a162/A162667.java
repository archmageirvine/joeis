package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162667 a(n) = 20*a(n-1)-97*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A162667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162667() {
    super(new long[] {-97, 20}, new long[] {1, 10});
  }
}
