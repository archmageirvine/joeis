package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145320 Numbers n such that there exists x in N : (x+31)^3-x^3=n^2.
 * @author Sean A. Irvine
 */
public class A145320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145320() {
    super(new long[] {-1, 24302}, new long[] {6727, 163472827});
  }
}
