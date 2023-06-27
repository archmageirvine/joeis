package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263200 Number of perfect matchings on a M\u00f6bius strip of width 3 and length 2n.
 * @author Sean A. Irvine
 */
public class A263200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263200() {
    super(2, new long[] {-1, 4}, new long[] {28, 104});
  }
}
