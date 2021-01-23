package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048467 a(n) = T(6,n), array T given by A047858.
 * @author Sean A. Irvine
 */
public class A048467 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048467() {
    super(new long[] {4, -8, 5}, new long[] {1, 8, 23});
  }
}
