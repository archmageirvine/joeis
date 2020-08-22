package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163475 a(n) = 18*a(n-1) - 78*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 30.
 * @author Sean A. Irvine
 */
public class A163475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163475() {
    super(new long[] {-78, 18}, new long[] {3, 30});
  }
}
