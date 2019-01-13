package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263313.
 * @author Sean A. Irvine
 */
public class A263313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263313() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {3, 0, 1, 2, 7});
  }
}
