package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025445 Expansion of 1/((1-2*x)*(1-3*x)*(1-4*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A025445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025445() {
    super(new long[] {-168, 206, -89, 16}, new long[] {1, 16, 167, 1454});
  }
}
