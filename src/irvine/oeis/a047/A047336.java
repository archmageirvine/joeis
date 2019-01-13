package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047336.
 * @author Sean A. Irvine
 */
public class A047336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047336() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 8});
  }
}
