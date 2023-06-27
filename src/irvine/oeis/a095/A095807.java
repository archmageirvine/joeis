package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095807 Number of integers from 0 to 10^n - 1 whose decimal digits include at least one 0.
 * @author Sean A. Irvine
 */
public class A095807 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095807() {
    super(1, new long[] {90, -109, 20}, new long[] {1, 10, 181});
  }
}
