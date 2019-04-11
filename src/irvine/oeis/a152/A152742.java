package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152742 13 times the squares: <code>13*n^2</code>.
 * @author Sean A. Irvine
 */
public class A152742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152742() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 52});
  }
}
