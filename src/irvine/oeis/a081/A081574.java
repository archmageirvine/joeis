package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081574 Fourth binomial transform of Fibonacci numbers <code>F(n)</code>.
 * @author Sean A. Irvine
 */
public class A081574 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081574() {
    super(new long[] {-19, 9}, new long[] {0, 1});
  }
}
