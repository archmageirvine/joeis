package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175016 y-values in the solution to <code>x^2-58*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A175016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175016() {
    super(new long[] {-1, 39206}, new long[] {0, 2574});
  }
}
