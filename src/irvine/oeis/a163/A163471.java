package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163471 a(n) = 10*a(n-1) - 22*a(n-2) for n &gt; 1; a(0) = 3, a(1) = 18.
 * @author Sean A. Irvine
 */
public class A163471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163471() {
    super(new long[] {-22, 10}, new long[] {3, 18});
  }
}
