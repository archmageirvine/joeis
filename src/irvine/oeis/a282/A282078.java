package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282078 Number of 10-element subsets of [n+10] having an even sum.
 * @author Sean A. Irvine
 */
public class A282078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282078() {
    super(new long[] {1, -6, 10, 10, -50, 34, 66, -110, 0, 110, -66, -34, 50, -10, -10, 6}, new long[] {0, 5, 30, 140, 490, 1491, 3976, 9696, 21816, 46126, 92252, 176232, 323092, 571802, 980232, 1633984});
  }
}
