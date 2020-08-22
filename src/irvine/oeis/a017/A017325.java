package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017325 a(n) = (10*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A017325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017325() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 20661046784L, 2641807540224L, 60716992766464L, 618121839509504L, 3904305912313344L, 18014398509481984L, 66540410775079424L, 208215748530929664L, 572994802228616704L});
  }
}
