package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228522 y-values in the solution to the Pell equation <code>x^2 -</code> 29*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228522 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228522() {
    super(new long[] {-1, 19602}, new long[] {13, 254813});
  }
}
