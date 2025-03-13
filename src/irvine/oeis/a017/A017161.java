package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017161 Expansion of g.f. 1/((1 - 3*x)*(1 - 4*x)*(1 - 12*x)).
 * @author Sean A. Irvine
 */
public class A017161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017161() {
    super(new long[] {144, -96, 19}, new long[] {1, 19, 265});
  }
}
