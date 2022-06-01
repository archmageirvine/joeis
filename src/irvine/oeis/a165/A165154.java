package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165154 a(n) = 100*a(n-1) +/- 9^(n-1) for n&gt;0, a(0)=0.
 * @author Sean A. Irvine
 */
public class A165154 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165154() {
    super(new long[] {900, 91}, new long[] {0, 1});
  }
}
