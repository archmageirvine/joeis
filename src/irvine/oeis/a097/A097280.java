package irvine.oeis.a097;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A097280 Perimeter of integer triangle (A001611(n), A001611(n+1), A001611(n+2)).
 * @author Sean A. Irvine
 */
public class A097280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097280() {
    super(new long[] {-1, 0, 2}, new long[] {5, 7, 9});
  }
}
