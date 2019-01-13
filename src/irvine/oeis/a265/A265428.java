package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265428.
 * @author Sean A. Irvine
 */
public class A265428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265428() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 2, 4, 4});
  }
}
