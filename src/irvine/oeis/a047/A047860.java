package irvine.oeis.a047;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A047860 a(n) = T(3,n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A047860 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047860() {
    super(new long[] {4, -8, 5}, new long[] {1, 5, 14});
  }
}
