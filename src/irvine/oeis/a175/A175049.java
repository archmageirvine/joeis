package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175049 y-values in the solution to <code>x^2-59*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A175049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175049() {
    super(new long[] {-1, 1060}, new long[] {0, 69});
  }
}
