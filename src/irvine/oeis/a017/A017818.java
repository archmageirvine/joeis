package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017818 Expansion of 1/(1-x^3-x^4-x^5).
 * @author Sean A. Irvine
 */
public class A017818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017818() {
    super(new long[] {1, 1, 1, 0, 0}, new long[] {1, 0, 0, 1, 1});
  }
}
