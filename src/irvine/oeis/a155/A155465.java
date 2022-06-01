package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155465 a(n) = 7*a(n-1) - 7*a(n-2) + a(n-3) for n &gt; 2; a(0) = 7, a(1) = 88, a(2) = 555.
 * @author Sean A. Irvine
 */
public class A155465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155465() {
    super(new long[] {1, -7, 7}, new long[] {7, 88, 555});
  }
}
