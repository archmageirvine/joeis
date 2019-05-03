package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178320 INVERT transform of <code>A008805</code> (triangular numbers with repeats).
 * @author Sean A. Irvine
 */
public class A178320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178320() {
    super(new long[] {1, -1, -2, 2, 2}, new long[] {1, 2, 6, 14, 35});
  }
}
