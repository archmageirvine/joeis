package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047277.
 * @author Sean A. Irvine
 */
public class A047277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047277() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 6, 7});
  }
}
