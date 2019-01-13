package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041279.
 * @author Sean A. Irvine
 */
public class A041279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041279() {
    super(new long[] {-1, 0, 74, 0}, new long[] {1, 3, 73, 222});
  }
}
