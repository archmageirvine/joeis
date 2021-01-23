package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163114 a(n) = 5*a(n-2) for n &gt; 2; a(1) = 3, a(2) = 5.
 * @author Sean A. Irvine
 */
public class A163114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163114() {
    super(new long[] {5, 0}, new long[] {3, 5});
  }
}
