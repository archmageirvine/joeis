package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048477 a(n) = T(5,n), array T given by A048472.
 * @author Sean A. Irvine
 */
public class A048477 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048477() {
    super(new long[] {4, -8, 5}, new long[] {1, 7, 25});
  }
}
