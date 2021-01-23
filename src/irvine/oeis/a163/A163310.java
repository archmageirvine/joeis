package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163310 a(n) = 20*a(n-1) - 95*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 11.
 * @author Sean A. Irvine
 */
public class A163310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163310() {
    super(new long[] {-95, 20}, new long[] {1, 11});
  }
}
