package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117302.
 * @author Sean A. Irvine
 */
public class A117302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117302() {
    super(new long[] {-2, 1, 0, 0, 0, 0, 0, 2}, new long[] {1, 2, 4, 8, 16, 32, 64, 129});
  }
}
