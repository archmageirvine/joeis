package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163166 a(n) = 20*a(n-1)-95*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A163166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163166() {
    super(new long[] {-95, 20}, new long[] {1, 10});
  }
}
