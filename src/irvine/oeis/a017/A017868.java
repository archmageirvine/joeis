package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017868 Expansion of <code>1/(1-x^8-x^9-x^10)</code>.
 * @author Sean A. Irvine
 */
public class A017868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017868() {
    super(new long[] {1, 1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 1, 1});
  }
}
