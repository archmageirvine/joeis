package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016131 Expansion of 1/((1-2x)(1-8x)).
 * @author Sean A. Irvine
 */
public class A016131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016131() {
    super(new long[] {-16, 10}, new long[] {1, 10});
  }
}
