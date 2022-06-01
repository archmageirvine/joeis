package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168559 a(n) = n^2 + a(n-1), with a(1)=0.
 * @author Sean A. Irvine
 */
public class A168559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168559() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 4, 13, 29});
  }
}
