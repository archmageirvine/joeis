package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113449.
 * @author Sean A. Irvine
 */
public class A113449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113449() {
    super(new long[] {1, -4, -12, 8}, new long[] {2, 8, 40, 216});
  }
}
