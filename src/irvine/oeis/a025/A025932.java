package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025932 Expansion of 1/((1-2*x)*(1-3*x)*(1-5*x)*(1-8*x)).
 * @author Sean A. Irvine
 */
public class A025932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025932() {
    super(new long[] {-240, 278, -111, 18}, new long[] {1, 18, 213, 2114});
  }
}
