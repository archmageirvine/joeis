package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239574.
 * @author Sean A. Irvine
 */
public class A239574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239574() {
    super(new long[] {1, -2, -3, 5, 8, -3, -19, -4, 24, 15, -15, -24, 4, 19, 3, -8, -5, 3, 2}, new long[] {0, 1, 24, 200, 1053, 3932, 11988, 31298, 73046, 155880, 310046, 581414, 1038634, 1779531, 2942114, 4714412, 7350595, 11184786, 16654116});
  }
}
