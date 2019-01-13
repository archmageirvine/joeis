package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244213.
 * @author Sean A. Irvine
 */
public class A244213 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244213() {
    super(new long[] {1, 0, -2}, new long[] {-2, 3, -1});
  }
}
