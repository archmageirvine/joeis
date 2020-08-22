package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163460 a(n) = 16*a(n-1) - 62*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A163460 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163460() {
    super(new long[] {-62, 16}, new long[] {1, 9});
  }
}
