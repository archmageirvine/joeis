package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155923 Positive numbers y such that y^2 is of the form x^2+(x+17)^2 with integer x.
 * @author Sean A. Irvine
 */
public class A155923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155923() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {13, 17, 25, 53, 85, 137});
  }
}
