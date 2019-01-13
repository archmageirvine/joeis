package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113450.
 * @author Sean A. Irvine
 */
public class A113450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113450() {
    super(new long[] {1, -4, -12, 8}, new long[] {0, 4, 30, 192});
  }
}
