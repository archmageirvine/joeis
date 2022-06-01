package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145322 Numbers n such that there exists x in N : (x+1)^3-x^3=31*n^2.
 * @author Sean A. Irvine
 */
public class A145322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145322() {
    super(new long[] {-1, 24302}, new long[] {7, 170107});
  }
}
