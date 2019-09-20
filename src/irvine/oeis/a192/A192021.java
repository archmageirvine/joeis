package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192021 The Wiener index of the binomial tree of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A192021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192021() {
    super(new long[] {32, -32, 10}, new long[] {0, 1, 10});
  }
}
