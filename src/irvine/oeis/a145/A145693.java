package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145693 Numbers X such that there exists Y in N with X^2=21*Y^2+7.
 * @author Sean A. Irvine
 */
public class A145693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145693() {
    super(1, new long[] {-1, 110}, new long[] {14, 1526});
  }
}
