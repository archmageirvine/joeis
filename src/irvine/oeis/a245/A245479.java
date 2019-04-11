package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245479 Numbers n such that the n-th cyclotomic polynomial has a root <code>mod 7</code>.
 * @author Sean A. Irvine
 */
public class A245479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245479() {
    super(new long[] {7, 0, 0, 0}, new long[] {1, 2, 3, 6});
  }
}
