package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011779 Expansion of <code>1/((1-x)^3*(1-x^3)^2)</code>.
 * @author Sean A. Irvine
 */
public class A011779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011779() {
    super(new long[] {1, -3, 3, -3, 6, -6, 3, -3, 3}, new long[] {1, 3, 6, 12, 21, 33, 51, 75, 105});
  }
}
