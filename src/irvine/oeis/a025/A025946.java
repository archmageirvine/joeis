package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025946 Expansion of 1/((1-2x)(1-3x)(1-7x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A025946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025946() {
    super(new long[] {-462, 493, -173, 23}, new long[] {1, 23, 356, 4702});
  }
}
