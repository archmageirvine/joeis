package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021076.
 * @author Sean A. Irvine
 */
public class A021076 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021076() {
    super(new long[] {-48, 92, -56, 13}, new long[] {1, 13, 113, 833});
  }
}
