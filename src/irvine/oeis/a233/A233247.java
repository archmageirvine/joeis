package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233247.
 * @author Sean A. Irvine
 */
public class A233247 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233247() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 1, 4, 9, 16});
  }
}
