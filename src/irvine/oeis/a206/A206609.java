package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206609 Fibonacci sequence beginning <code>13, 9</code>.
 * @author Sean A. Irvine
 */
public class A206609 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206609() {
    super(new long[] {1, 1}, new long[] {13, 9});
  }
}
