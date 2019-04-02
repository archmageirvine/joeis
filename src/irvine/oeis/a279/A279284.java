package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279284 A self-composition of the pentagonal numbers: A(x) = G(G(x)), where G(x) = g.f. of A000326.
 * @author Sean A. Irvine
 */
public class A279284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279284() {
    super(new long[] {1, -3, 15, -28, 66, -75, 91, -51, 12}, new long[] {0, 1, 10, 74, 469, 2662, 14115, 71360, 348143});
  }
}
