package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245478 Numbers n such that the n-th cyclotomic polynomial has a root <code>mod 5</code>.
 * @author Sean A. Irvine
 */
public class A245478 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245478() {
    super(new long[] {5, 0, 0}, new long[] {1, 2, 4});
  }
}
