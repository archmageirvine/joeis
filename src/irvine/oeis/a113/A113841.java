package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113841.
 * @author Sean A. Irvine
 */
public class A113841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113841() {
    super(new long[] {-64, 64, 0, 1}, new long[] {1, 3, 7, 71});
  }
}
