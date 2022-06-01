package irvine.oeis.a206;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A206607 Fibonacci sequence beginning 13, 11.
 * @author Sean A. Irvine
 */
public class A206607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206607() {
    super(new long[] {1, 1}, new long[] {13, 11});
  }
}
