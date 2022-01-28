package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017409 a(n) = (11n+1)^9.
 * @author Sean A. Irvine
 */
public class A017409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017409() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 5159780352L, 1801152661463L, 60716992766464L, 756680642578125L, 5416169448144896L, 27206534396294947L, 106868920913284608L, 350356403707485209L, 1000000000000000000L});
  }
}
