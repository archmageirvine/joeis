package irvine.oeis.a227;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A227273 Expansion of 1/((1-x)*(1-4*x)*(1-10*x)*(1-20*x)*(1-35*x)).
 * @author Sean A. Irvine
 */
public class A227273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227273() {
    super(new long[] {28000, -40000, 13510, -1579, 70}, new long[] {1, 70, 3321, 135450, 5143341});
  }
}
