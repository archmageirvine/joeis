package irvine.oeis.a175;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A175014 y-values in the solution to x^2-55*y^2=1.
 * @author Sean A. Irvine
 */
public class A175014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175014() {
    super(1, new long[] {-1, 178}, new long[] {0, 12});
  }
}
