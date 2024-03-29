package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206610 Fibonacci sequence beginning 13, 8.
 * @author Sean A. Irvine
 */
public class A206610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206610() {
    super(1, new long[] {1, 1}, new long[] {13, 8});
  }
}
