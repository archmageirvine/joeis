package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228538 y-values in the solution to the Pell equation <code>x^2 -</code> 58*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228538() {
    super(new long[] {-1, 39206}, new long[] {13, 509665});
  }
}
