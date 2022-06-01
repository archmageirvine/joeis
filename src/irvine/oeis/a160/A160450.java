package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160450 Expansion of (1-34*x+276*x^2-584*x^3)/((1-3*x)*(1-4*x)*(1-8*x)*(1-24*x)).
 * @author Sean A. Irvine
 */
public class A160450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160450() {
    super(new long[] {-2304, 1728, -428, 39}, new long[] {1, 5, 43, 681});
  }
}
