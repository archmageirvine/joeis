package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017897 Expansion of 1/((1-3*x)*(1-5*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A017897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017897() {
    super(new long[] {135, -87, 17}, new long[] {1, 17, 202});
  }
}
