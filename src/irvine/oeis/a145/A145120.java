package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145120 Numbers X such that (X^2-19)/57 is a square.
 * @author Sean A. Irvine
 */
public class A145120 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145120() {
    super(1, new long[] {-1, 302}, new long[] {38, 11438});
  }
}
