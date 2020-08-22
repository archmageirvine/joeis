package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081575 Fifth binomial transform of Fibonacci numbers F(n).
 * @author Sean A. Irvine
 */
public class A081575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081575() {
    super(new long[] {-29, 11}, new long[] {0, 1});
  }
}
