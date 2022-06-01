package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145525 Numbers X such that there exists Y in N : X^2=273*Y^2+91.
 * @author Sean A. Irvine
 */
public class A145525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145525() {
    super(new long[] {-1, 1454}, new long[] {182, 264446});
  }
}
