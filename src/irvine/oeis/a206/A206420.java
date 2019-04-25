package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206420 Fibonacci sequence beginning 11, 8.
 * @author Sean A. Irvine
 */
public class A206420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206420() {
    super(new long[] {1, 1}, new long[] {11, 8});
  }
}
