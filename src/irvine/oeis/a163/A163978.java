package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163978 a(n) = 2*a(n-2) for n &gt; 2; a(1) = 3, a(2) = 4.
 * @author Sean A. Irvine
 */
public class A163978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163978() {
    super(1, new long[] {2, 0}, new long[] {3, 4});
  }
}
