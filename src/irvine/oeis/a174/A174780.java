package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174780 y-values in the solution to <code>x^2-43*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174780() {
    super(new long[] {-1, 6964}, new long[] {0, 531});
  }
}
