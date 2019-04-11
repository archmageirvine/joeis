package irvine.oeis.a266;

import irvine.oeis.LinearRecurrence;

/**
 * A266806 Coefficient of <code>x^2</code> in the minimal polynomial of the continued fraction <code>[1^n,sqrt(6),1,1,</code>...], where <code>1^n</code> means n ones. S.
 * @author Sean A. Irvine
 */
public class A266806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266806() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {-13, 143, 527, 4859, 30119});
  }
}
