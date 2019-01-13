package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244730.
 * @author Sean A. Irvine
 */
public class A244730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244730() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 32, 162, 512});
  }
}
