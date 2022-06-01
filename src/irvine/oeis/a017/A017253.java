package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017253 a(n) = (9*n + 7)^9.
 * @author Sean A. Irvine
 */
public class A017253 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017253() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {40353607, 68719476736L, 3814697265625L, 60716992766464L, 502592611936843L, 2779905883635712L, 11694146092834141L, 40353607000000000L, 119851595982618319L, 316478381828866048L});
  }
}
