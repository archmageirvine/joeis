package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113727.
 * @author Sean A. Irvine
 */
public class A113727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113727() {
    super(new long[] {1, 4, 4, 0}, new long[] {1, 0, 4, 4});
  }
}
