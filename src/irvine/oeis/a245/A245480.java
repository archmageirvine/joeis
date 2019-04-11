package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245480 Numbers n such that the n-th cyclotomic polynomial has a root <code>mod 11</code>.
 * @author Sean A. Irvine
 */
public class A245480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245480() {
    super(new long[] {11, 0, 0, 0}, new long[] {1, 2, 5, 10});
  }
}
