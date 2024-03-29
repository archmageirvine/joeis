package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077868 Expansion of 1/((1-x)*(1-x-x^3)).
 * @author Sean A. Irvine
 */
public class A077868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077868() {
    super(new long[] {-1, 1, -1, 2}, new long[] {1, 2, 3, 5});
  }
}
