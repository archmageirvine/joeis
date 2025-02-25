package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020606 Expansion of g.f. 1/((1-6*x)*(1-9*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A020606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020606() {
    super(new long[] {594, -219, 26}, new long[] {1, 26, 457});
  }
}
