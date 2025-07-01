package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016293 Expansion of 1 / ((1-2*x) * (1-4*x) * (1-11*x)).
 * @author Sean A. Irvine
 */
public class A016293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016293() {
    super(new long[] {88, -74, 17}, new long[] {1, 17, 215});
  }
}
