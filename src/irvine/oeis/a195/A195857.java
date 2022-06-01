package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195857 a(n) = T(9, n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A195857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195857() {
    super(new long[] {4, -8, 5}, new long[] {1, 11, 32});
  }
}
