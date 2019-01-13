package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113312.
 * @author Sean A. Irvine
 */
public class A113312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113312() {
    super(new long[] {-1, 2, 0}, new long[] {1, 2, 3});
  }
}
