package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163461 a(n) = 18*a(n-1) - 79*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 10.
 * @author Sean A. Irvine
 */
public class A163461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163461() {
    super(new long[] {-79, 18}, new long[] {1, 10});
  }
}
