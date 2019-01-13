package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141046.
 * @author Sean A. Irvine
 */
public class A141046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141046() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 64, 324, 1024});
  }
}
