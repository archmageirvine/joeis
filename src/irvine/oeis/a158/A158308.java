package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158308 361n - 1.
 * @author Sean A. Irvine
 */
public class A158308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158308() {
    super(1, new long[] {-1, 2}, new long[] {360, 721});
  }
}
