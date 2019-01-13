package irvine.oeis.a043;

import irvine.oeis.LinearRecurrence;

/**
 * A043547.
 * @author Sean A. Irvine
 */
public class A043547 extends LinearRecurrence {

  /** Construct the sequence. */
  public A043547() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 2, 3, 6});
  }
}
