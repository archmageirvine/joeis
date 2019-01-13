package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047590.
 * @author Sean A. Irvine
 */
public class A047590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047590() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 6, 7, 8});
  }
}
