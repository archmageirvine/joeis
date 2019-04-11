package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091074 Fibonacci sequence beginning <code>12, 67</code>.
 * @author Sean A. Irvine
 */
public class A091074 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091074() {
    super(new long[] {1, 1}, new long[] {12, 67});
  }
}
