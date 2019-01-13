package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017237.
 * @author Sean A. Irvine
 */
public class A017237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017237() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7776, 759375, 7962624, 39135393, 130691232, 345025251});
  }
}
