package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047506.
 * @author Sean A. Irvine
 */
public class A047506 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047506() {
    super(new long[] {-1, 1, 0, 1}, new long[] {4, 6, 7, 12});
  }
}
