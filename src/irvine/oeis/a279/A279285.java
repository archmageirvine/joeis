package irvine.oeis.a279;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A279285 Self-composition of the Pell numbers; g.f.: A(x) = G(G(x)), where G(x) = g.f. of A000129.
 * @author Sean A. Irvine
 */
public class A279285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279285() {
    super(new long[] {-1, -6, -5, 6}, new long[] {0, 1, 4, 18});
  }
}
