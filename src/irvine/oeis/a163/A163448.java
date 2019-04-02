package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163448 a(n) = 20*a(n-1) - 98*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 12.
 * @author Sean A. Irvine
 */
public class A163448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163448() {
    super(new long[] {-98, 20}, new long[] {1, 12});
  }
}
