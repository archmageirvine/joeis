package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016905 a(n) = (5*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A016905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016905() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 387420489, 20661046784L, 322687697779L, 2641807540224L, 14507145975869L, 60716992766464L, 208728361158759L, 618121839509504L, 1628413597910449L});
  }
}
