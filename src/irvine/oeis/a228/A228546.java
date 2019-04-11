package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228546 x-values in the solution to the Pell equation <code>x^2 -</code> 74*y^2 <code>= -1</code>.
 * @author Sean A. Irvine
 */
public class A228546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228546() {
    super(new long[] {-1, 7398}, new long[] {43, 318157});
  }
}
