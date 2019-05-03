package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145699 Numbers n such that there exists x in N with <code>(x+1)^3-x^3=37*n^2</code>.
 * @author Sean A. Irvine
 */
public class A145699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145699() {
    super(new long[] {-1, 590}, new long[] {1, 589});
  }
}
