package irvine.oeis.a245;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A245481 Numbers n such that the n-th cyclotomic polynomial has a root mod 13.
 * @author Sean A. Irvine
 */
public class A245481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245481() {
    super(new long[] {13, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 6, 12});
  }
}
