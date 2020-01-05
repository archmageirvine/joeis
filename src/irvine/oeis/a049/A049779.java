package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049779 <code>a(n) = Sum_{k=1..floor(n/2)} T(n, 2k)</code>, array T as in <code>A049777</code>.
 * @author Sean A. Irvine
 */
public class A049779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049779() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 5, 13, 23, 41, 62});
  }
}
