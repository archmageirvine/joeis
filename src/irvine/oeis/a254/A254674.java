package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254674.
 * @author Sean A. Irvine
 */
public class A254674 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254674() {
    super(new long[] {1, -1, -62, 62, 1}, new long[] {1, 10, 34, 601, 2089});
  }
}
