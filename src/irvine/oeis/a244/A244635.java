package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244635 29*n^2.
 * @author Sean A. Irvine
 */
public class A244635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244635() {
    super(new long[] {1, -3, 3}, new long[] {0, 29, 116});
  }
}
