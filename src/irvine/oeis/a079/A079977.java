package irvine.oeis.a079;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A079977 Fibonacci numbers interspersed with zeros.
 * @author Sean A. Irvine
 */
public class A079977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079977() {
    super(new long[] {1, 0, 1, 0}, new long[] {1, 0, 1, 0});
  }
}
