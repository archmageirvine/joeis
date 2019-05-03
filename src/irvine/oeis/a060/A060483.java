package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060483 Number of 5-block tricoverings of an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A060483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060483() {
    super(new long[] {-80, 148, -84, 17}, new long[] {3, 57, 717, 7845});
  }
}
