package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145694 Numbers Y such that 57*Y^2+19 is a square.
 * @author Sean A. Irvine
 */
public class A145694 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145694() {
    super(new long[] {-1, 302}, new long[] {5, 1515});
  }
}
