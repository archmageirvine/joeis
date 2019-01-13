package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083589.
 * @author Sean A. Irvine
 */
public class A083589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083589() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 4, 16, 64, 257});
  }
}
