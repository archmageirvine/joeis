package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178073 Partial sums of sequence A177342.
 * @author Sean A. Irvine
 */
public class A178073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178073() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 41, 116, 265});
  }
}
