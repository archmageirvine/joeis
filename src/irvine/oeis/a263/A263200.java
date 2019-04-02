package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263200 Number of perfect matchings on a M&#246;bius strip of width 3 and length 2n.
 * @author Sean A. Irvine
 */
public class A263200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263200() {
    super(new long[] {-1, 4}, new long[] {28, 104});
  }
}
