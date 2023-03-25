package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196792 a(n) = T(10,n), array T given by A047848.
 * @author Sean A. Irvine
 */
public class A196792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196792() {
    super(new long[] {-13, 14}, new long[] {1, 2});
  }
}
