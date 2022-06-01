package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017878 Expansion of 1/(1-x^9-x^10-x^11).
 * @author Sean A. Irvine
 */
public class A017878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017878() {
    super(new long[] {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1});
  }
}
