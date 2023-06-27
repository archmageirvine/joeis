package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245480 Numbers n such that the n-th cyclotomic polynomial has a root mod 11.
 * @author Sean A. Irvine
 */
public class A245480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245480() {
    super(1, new long[] {11, 0, 0, 0}, new long[] {1, 2, 5, 10});
  }
}
