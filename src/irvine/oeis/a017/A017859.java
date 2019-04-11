package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017859 Expansion of <code>1/(1-x^7-x^8-x^9-x^10)</code>.
 * @author Sean A. Irvine
 */
public class A017859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017859() {
    super(new long[] {1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 1});
  }
}
