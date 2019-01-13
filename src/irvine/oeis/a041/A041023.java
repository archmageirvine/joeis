package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041023.
 * @author Sean A. Irvine
 */
public class A041023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041023() {
    super(new long[] {-1, 0, 8, 0}, new long[] {1, 1, 7, 8});
  }
}
