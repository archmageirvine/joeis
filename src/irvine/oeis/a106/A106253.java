package irvine.oeis.a106;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A106253 First difference of A106252.
 * @author Sean A. Irvine
 */
public class A106253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106253() {
    super(new long[] {1, 1, 0, -1}, new long[] {2, 2, 2, 1});
  }
}
