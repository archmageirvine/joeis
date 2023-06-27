package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145305 Numbers Y such that 237*Y^2+79 is a square.
 * @author Sean A. Irvine
 */
public class A145305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145305() {
    super(1, new long[] {-1, 456302}, new long[] {195, 88979085});
  }
}
