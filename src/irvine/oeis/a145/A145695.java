package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145695 Numbers X such that there exists Y in N with X^2=111*Y^2+37.
 * @author Sean A. Irvine
 */
public class A145695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145695() {
    super(new long[] {-1, 590}, new long[] {74, 43586});
  }
}
