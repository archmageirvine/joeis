package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113301.
 * @author Sean A. Irvine
 */
public class A113301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113301() {
    super(new long[] {-1, 0, -2, 4}, new long[] {0, 1, 5, 18});
  }
}
