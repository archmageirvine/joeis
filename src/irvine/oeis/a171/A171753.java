package irvine.oeis.a171;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A171753 Expansion of g.f. 1/(1-3*x-x^2/(1-3*x-x^2/(1-3*x))).
 * @author Sean A. Irvine
 */
public class A171753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171753() {
    super(new long[] {21, -25, 9}, new long[] {1, 3, 10});
  }
}
