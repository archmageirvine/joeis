package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145721 Numbers n such that there exists x in N with (x+1)^3-x^3=127*n^2.
 * @author Sean A. Irvine
 */
public class A145721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145721() {
    super(new long[] {-1, 2030}, new long[] {1, 2029});
  }
}
