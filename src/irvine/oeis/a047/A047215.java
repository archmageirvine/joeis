package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047215.
 * @author Sean A. Irvine
 */
public class A047215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047215() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 5});
  }
}
