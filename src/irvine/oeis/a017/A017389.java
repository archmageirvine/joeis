package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017389 Expansion of g.f. 1/((1-3*x)*(1-5*x)*(1-7*x)).
 * @author Sean A. Irvine
 */
public class A017389 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017389() {
    super(new long[] {105, -71, 15}, new long[] {1, 15, 154});
  }
}
