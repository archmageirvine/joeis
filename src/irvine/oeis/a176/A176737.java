package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176737 Expansion of 1 / (1-4*x^2-3*x^3). (4,3)-Padovan sequence.
 * @author Sean A. Irvine
 */
public class A176737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176737() {
    super(new long[] {3, 4, 0}, new long[] {1, 0, 4});
  }
}
