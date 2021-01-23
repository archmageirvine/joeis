package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206611 Fibonacci sequence beginning 13, 7.
 * @author Sean A. Irvine
 */
public class A206611 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206611() {
    super(new long[] {1, 1}, new long[] {13, 7});
  }
}
