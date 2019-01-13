package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041006.
 * @author Sean A. Irvine
 */
public class A041006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041006() {
    super(new long[] {-1, 0, 10, 0}, new long[] {2, 5, 22, 49});
  }
}
