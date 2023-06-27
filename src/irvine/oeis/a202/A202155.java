package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202155 x-values in the solution to  x^2 - 13*y^2 = -1.
 * @author Sean A. Irvine
 */
public class A202155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202155() {
    super(1, new long[] {-1, 1298}, new long[] {18, 23382});
  }
}
