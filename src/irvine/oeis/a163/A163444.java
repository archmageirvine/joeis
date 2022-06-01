package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163444 a(n) = 12*a(n-1) - 34*a(n-2) for n &gt; 1; a(0) = 1, a(1) = 8.
 * @author Sean A. Irvine
 */
public class A163444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163444() {
    super(new long[] {-34, 12}, new long[] {1, 8});
  }
}
