package irvine.oeis.a060;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A060483 Number of 5-block tricoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A060483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060483() {
    super(3, new long[] {-80, 148, -84, 17}, new long[] {3, 57, 717, 7845});
  }
}
