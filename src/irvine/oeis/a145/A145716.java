package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145716 Numbers Y such that 381*Y^2+127 is a square.
 * @author Sean A. Irvine
 */
public class A145716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145716() {
    super(new long[] {-1, 2030}, new long[] {13, 26403});
  }
}
