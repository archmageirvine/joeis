package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176374 y-values in the solution to <code>x^2 - 67*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A176374 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176374() {
    super(new long[] {-1, 97684}, new long[] {0, 5967});
  }
}
