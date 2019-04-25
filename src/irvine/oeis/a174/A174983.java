package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174983 y-values in the solution to <code>x^2-53*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A174983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174983() {
    super(new long[] {-1, 132498}, new long[] {0, 9100});
  }
}
