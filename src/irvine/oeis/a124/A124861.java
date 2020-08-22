package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124861 Expansion of 1/(1-x-3x^2-4x^3-2x^4).
 * @author Sean A. Irvine
 */
public class A124861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124861() {
    super(new long[] {2, 4, 3, 1}, new long[] {1, 1, 4, 11});
  }
}
