package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113618.
 * @author Sean A. Irvine
 */
public class A113618 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113618() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 36, 1793, 24604, 167481, 756836, 2620201, 7526268});
  }
}
