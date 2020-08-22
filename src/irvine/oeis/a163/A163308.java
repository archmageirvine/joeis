package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163308 a(n) = 16*a(n-1) - 59*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 9.
 * @author Sean A. Irvine
 */
public class A163308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163308() {
    super(new long[] {-59, 16}, new long[] {1, 9});
  }
}
