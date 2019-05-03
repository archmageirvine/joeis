package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257939 x-values in the solutions to <code>x^2 + x = 5*y^2 +</code> y.
 * @author Sean A. Irvine
 */
public class A257939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257939() {
    super(new long[] {1, -1, -322, 322, 1}, new long[] {0, 2, 116, 798, 37512});
  }
}
