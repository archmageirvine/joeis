package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228206 y-values in the solution to <code>x^2 -</code> 13y^2 <code>= 108</code>.
 * @author Sean A. Irvine
 */
public class A228206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228206() {
    super(new long[] {-1, 0, 0, 0, 11, 0, 0, 0}, new long[] {1, 3, 6, 11, 22, 39, 69, 122});
  }
}
