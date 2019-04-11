package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042296 Numerators of continued fraction convergents to <code>sqrt(674)</code>.
 * @author Sean A. Irvine
 */
public class A042296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042296() {
    super(new long[] {-1, 0, 0, 0, 1350, 0, 0, 0}, new long[] {25, 26, 649, 675, 34399, 35074, 876175, 911249});
  }
}
