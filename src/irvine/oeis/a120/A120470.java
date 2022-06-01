package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120470 2*4^n +(-1)^n*2^(n-1).
 * @author Sean A. Irvine
 */
public class A120470 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120470() {
    super(new long[] {8, 2}, new long[] {7, 34});
  }
}
