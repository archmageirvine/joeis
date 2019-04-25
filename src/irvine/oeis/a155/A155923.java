package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155923 Positive numbers y such that <code>y^2</code> is of the form <code>x^2+(x+17)^2</code> with integer x.
 * @author Sean A. Irvine
 */
public class A155923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155923() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {13, 17, 25, 53, 85, 137});
  }
}
