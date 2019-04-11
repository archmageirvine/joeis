package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282077 Number of 9-element subsets of <code>[n+9]</code> having an even sum.
 * @author Sean A. Irvine
 */
public class A282077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282077() {
    super(new long[] {-1, 5, -5, -15, 35, 1, -65, 45, 45, -65, 1, 35, -15, -5, 5}, new long[] {0, 5, 25, 110, 350, 1001, 2485, 5720, 12120, 24310, 46126, 83980, 146860, 248710, 408430});
  }
}
