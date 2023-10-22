package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106511 Expansion of g.f. (1+x)^2/((1 + x + x^2)*(1 + x - x^2)).
 * @author Sean A. Irvine
 */
public class A106511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106511() {
    super(new long[] {1, 0, -1, -2}, new long[] {1, 0, 0, 0});
  }
}
