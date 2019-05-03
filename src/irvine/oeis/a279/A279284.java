package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279284 Self-composition of the pentagonal numbers; g.f.: <code>A(x) = G(G(x))</code>, where <code>G(x) =</code> g.f. of <code>A000326</code>.
 * @author Sean A. Irvine
 */
public class A279284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279284() {
    super(new long[] {1, -3, 15, -28, 66, -75, 91, -51, 12}, new long[] {0, 1, 10, 74, 469, 2662, 14115, 71360, 348143});
  }
}
