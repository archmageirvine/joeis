package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156066 Numbers n with property that <code>n^2</code> is a square arising in <code>A154138</code>.
 * @author Sean A. Irvine
 */
public class A156066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156066() {
    super(new long[] {-1, 0, 6, 0}, new long[] {2, 3, 9, 16});
  }
}
