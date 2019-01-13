package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198763.
 * @author Sean A. Irvine
 */
public class A198763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198763() {
    super(new long[] {-5, 6}, new long[] {3, 19});
  }
}
