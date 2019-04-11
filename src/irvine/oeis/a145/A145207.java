package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145207 Numbers n such that there exists x in N with <code>(x+67)^3-x^3=n^2</code>.
 * @author Sean A. Irvine
 */
public class A145207 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145207() {
    super(new long[] {-1, 1030190}, new long[] {139159, 143360071051L});
  }
}
