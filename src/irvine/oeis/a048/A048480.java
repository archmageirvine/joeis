package irvine.oeis.a048;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A048480 a(n) = T(8,n), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048480() {
    super(new long[] {4, -8, 5}, new long[] {1, 10, 37});
  }
}
