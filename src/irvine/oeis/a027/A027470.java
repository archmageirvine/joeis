package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027470 a(n) = 225*(n-1)*(n-2)/2.
 * @author Sean A. Irvine
 */
public class A027470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027470() {
    super(new long[] {1, -3, 3}, new long[] {225, 675, 1350});
  }
}
