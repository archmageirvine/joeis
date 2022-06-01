package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085385 Binomial transform of hexagonal pyramidal numbers A002412.
 * @author Sean A. Irvine
 */
public class A085385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085385() {
    super(new long[] {-16, 32, -24, 8}, new long[] {0, 1, 9, 46});
  }
}
