package irvine.oeis.a028;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A028060 Expansion of 1/((1-3x)(1-5x)(1-7x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A028060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028060() {
    super(new long[] {-945, 744, -206, 24}, new long[] {1, 24, 370, 4680});
  }
}
