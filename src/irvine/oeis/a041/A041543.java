package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041543.
 * @author Sean A. Irvine
 */
public class A041543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041543() {
    super(new long[] {-1, 0, 34, 0}, new long[] {1, 1, 33, 34});
  }
}
