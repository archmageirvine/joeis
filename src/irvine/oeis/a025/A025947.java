package irvine.oeis.a025;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A025947 Expansion of 1/((1-2*x)*(1-3*x)*(1-7*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A025947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025947() {
    super(new long[] {-504, 534, -185, 24}, new long[] {1, 24, 391, 5478});
  }
}
