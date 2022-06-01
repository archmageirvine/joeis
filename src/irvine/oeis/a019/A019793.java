package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019793 Expansion of 1/((1-5x)(1-6x)(1-9x)).
 * @author Sean A. Irvine
 */
public class A019793 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019793() {
    super(new long[] {270, -129, 20}, new long[] {1, 20, 271});
  }
}
