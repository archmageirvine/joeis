package irvine.oeis.a137;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A137229 Expansion of g.f. x/((1-x)*(1-3*x+2*x^2-x^3)).
 * @author Sean A. Irvine
 */
public class A137229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137229() {
    super(new long[] {-1, 3, -5, 4}, new long[] {1, 4, 11, 27});
  }
}
