package irvine.oeis.a196;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A196791 T(9, n), array T given by A047848.
 * @author Sean A. Irvine
 */
public class A196791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A196791() {
    super(new long[] {-12, 13}, new long[] {1, 2});
  }
}
