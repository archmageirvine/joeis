package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081674 Generalized Poly-Bernoulli numbers.
 * @author Sean A. Irvine
 */
public class A081674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081674() {
    super(new long[] {12, -19, 8}, new long[] {0, 1, 6});
  }
}
