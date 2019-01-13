package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126590.
 * @author Sean A. Irvine
 */
public class A126590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126590() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {3, 5, 6, 9, 10, 12, 18});
  }
}
