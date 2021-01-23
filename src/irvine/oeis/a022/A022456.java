package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022456 Expansion of 1/((1-x)*(1-5*x)*(1-7*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A022456 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022456() {
    super(new long[] {-420, 599, -203, 25}, new long[] {1, 25, 422, 6074});
  }
}
