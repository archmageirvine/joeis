package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156066 Numbers n with property that n^2 is a square arising in A154138.
 * @author Sean A. Irvine
 */
public class A156066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156066() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 3, 9, 16});
  }
}
