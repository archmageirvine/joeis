package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020571 Expansion of g.f. 1/((1-6*x)*(1-7*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A020571 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020571() {
    super(new long[] {378, -159, 22}, new long[] {1, 22, 325});
  }
}
