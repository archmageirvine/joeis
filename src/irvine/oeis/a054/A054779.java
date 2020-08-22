package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054779 6n*(6n-1)*(6n-2)*(6n-3)*(6n-4)*(6n-5).
 * @author Sean A. Irvine
 */
public class A054779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054779() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 720, 665280, 13366080, 96909120, 427518000, 1402410240});
  }
}
