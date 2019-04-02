package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163309 a(n) = 18*a(n-1) - 76*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A163309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163309() {
    super(new long[] {-76, 18}, new long[] {1, 10});
  }
}
