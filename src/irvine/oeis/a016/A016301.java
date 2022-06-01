package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016301 Expansion of 1/((1-2*x)*(1-5*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016301() {
    super(new long[] {110, -87, 18}, new long[] {1, 18, 237});
  }
}
