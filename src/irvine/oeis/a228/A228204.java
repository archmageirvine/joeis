package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228204 y-values in the solution to <code>x^2 - 13y^2 = 27</code>.
 * @author Sean A. Irvine
 */
public class A228204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228204() {
    super(new long[] {-1, 0, 0, 0, 1298, 0, 0, 0}, new long[] {3, 11, 61, 213, 4107, 14339, 79189, 276477});
  }
}
