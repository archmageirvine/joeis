package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070997 a(n) = 8*a(n-1) - a(n-2), a(0)=1, a(-1)=1.
 * @author Sean A. Irvine
 */
public class A070997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070997() {
    super(new long[] {-1, 8}, new long[] {1, 7});
  }
}
