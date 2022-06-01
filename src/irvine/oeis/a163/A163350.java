package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163350 a(n) = 8*a(n-1) - 14*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 6.
 * @author Sean A. Irvine
 */
public class A163350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163350() {
    super(new long[] {-14, 8}, new long[] {1, 6});
  }
}
