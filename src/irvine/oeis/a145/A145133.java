package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145133 Expansion of <code>x/((1 - x - x^4)*(1 - x)^4)</code>.
 * @author Sean A. Irvine
 */
public class A145133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145133() {
    super(new long[] {1, -4, 6, -3, -4, 10, -10, 5}, new long[] {0, 1, 5, 15, 35, 71, 132, 231});
  }
}
