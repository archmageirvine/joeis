package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145699 Numbers k such that there exists x in N with (x+1)^3-x^3 = 37*k^2.
 * @author Sean A. Irvine
 */
public class A145699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145699() {
    super(1, new long[] {-1, 590}, new long[] {1, 589});
  }
}
