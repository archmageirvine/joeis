package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175659.
 * @author Sean A. Irvine
 */
public class A175659 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175659() {
    super(new long[] {-6, -1, 4}, new long[] {1, 6, 16});
  }
}
