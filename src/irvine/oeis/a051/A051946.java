package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051946 Expansion of g.f.: (1+4*x)/(1-x)^7.
 * @author Sean A. Irvine
 */
public class A051946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051946() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 11, 56, 196, 546, 1302, 2772});
  }
}
