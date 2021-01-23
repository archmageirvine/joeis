package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228206 y-values in the solution to x^2 - 13y^2 = 108.
 * @author Sean A. Irvine
 */
public class A228206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228206() {
    super(new long[] {-1, 0, 0, 0, 11, 0, 0, 0}, new long[] {1, 3, 6, 11, 22, 39, 69, 122});
  }
}
