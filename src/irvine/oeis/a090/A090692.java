package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090692 Expansion of 2*(x^2-9*x+15) / ((1+x)*(1-3*x+x^2)).
 * @author Sean A. Irvine
 */
public class A090692 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090692() {
    super(new long[] {-1, 2, 2}, new long[] {30, 42, 146});
  }
}
