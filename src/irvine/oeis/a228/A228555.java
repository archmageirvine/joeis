package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228555 y-values in the solution to the Pell equation <code>x^2 - 85*y^2 = -1</code>.
 * @author Sean A. Irvine
 */
public class A228555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228555() {
    super(new long[] {-1, 571538}, new long[] {41, 23433017});
  }
}
