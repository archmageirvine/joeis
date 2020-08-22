package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028161 Expansion of 1/((1-4*x)*(1-9*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A028161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028161() {
    super(new long[] {-3960, 2186, -419, 34}, new long[] {1, 34, 737, 12998});
  }
}
