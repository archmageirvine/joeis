package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119306 Expansion of (1-4*x)/(1-x*(1-x)^3).
 * @author Sean A. Irvine
 */
public class A119306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119306() {
    super(new long[] {-1, 3, -3, 1}, new long[] {1, -3, -6, 6});
  }
}
