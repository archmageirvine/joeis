package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016262 Expansion of 1/((1-x)(1-9x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016262() {
    super(new long[] {99, -119, 21}, new long[] {1, 21, 322});
  }
}
