package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028205 Expansion of 1/((1-6x)(1-7x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A028205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028205() {
    super(new long[] {-4158, 2127, -401, 33}, new long[] {1, 33, 688, 11598});
  }
}
