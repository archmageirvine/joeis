package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228554 x-values in the solution to the Pell equation <code>x^2 -</code> 85*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228554 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228554() {
    super(new long[] {-1, 571538}, new long[] {378, 216041742});
  }
}
