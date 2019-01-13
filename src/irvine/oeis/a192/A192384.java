package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192384.
 * @author Sean A. Irvine
 */
public class A192384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192384() {
    super(new long[] {-4, -4, 8, 2}, new long[] {0, 2, 4, 24});
  }
}
