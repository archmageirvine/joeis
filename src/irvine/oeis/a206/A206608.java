package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206608 Fibonacci sequence beginning <code>13, 10</code>.
 * @author Sean A. Irvine
 */
public class A206608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206608() {
    super(new long[] {1, 1}, new long[] {13, 10});
  }
}
