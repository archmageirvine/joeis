package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018055 Expansion of 1/((1-3*x)*(1-7*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A018055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018055() {
    super(new long[] {252, -141, 22}, new long[] {1, 22, 343});
  }
}
