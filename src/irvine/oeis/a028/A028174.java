package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028174 Expansion of 1/((1-5x)(1-6x)(1-9x)(1-10x)).
 * @author Sean A. Irvine
 */
public class A028174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028174() {
    super(new long[] {-2700, 1560, -329, 30}, new long[] {1, 30, 571, 8820});
  }
}
