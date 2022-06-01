package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081567 Second binomial transform of F(n+1).
 * @author Sean A. Irvine
 */
public class A081567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081567() {
    super(new long[] {-5, 5}, new long[] {1, 3});
  }
}
