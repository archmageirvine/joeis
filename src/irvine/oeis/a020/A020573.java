package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020573 Expansion of g.f. 1/((1 - 6*x)*(1 - 7*x)*(1 - 11*x)).
 * @author Sean A. Irvine
 */
public class A020573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020573() {
    super(new long[] {462, -185, 24}, new long[] {1, 24, 391});
  }
}
