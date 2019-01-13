package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113954.
 * @author Sean A. Irvine
 */
public class A113954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113954() {
    super(new long[] {2, 3, 0}, new long[] {1, 0, 1});
  }
}
