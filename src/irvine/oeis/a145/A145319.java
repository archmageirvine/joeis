package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145319 Numbers Y such that 93*Y^2+31 is a square.
 * @author Sean A. Irvine
 */
public class A145319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145319() {
    super(new long[] {-1, 24302}, new long[] {45, 1093635});
  }
}
