package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059947 Number of 6-block bicoverings of an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A059947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059947() {
    super(new long[] {-151200, 387000, -382908, 194762, -56319, 9550, -932, 48}, new long[] {0, 0, 0, 3, 256, 7255, 149660, 2681063});
  }
}
