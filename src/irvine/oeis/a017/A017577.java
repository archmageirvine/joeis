package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017577 (12n+4)^9.
 * @author Sean A. Irvine
 */
public class A017577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017577() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 68719476736L, 10578455953408L, 262144000000000L, 2779905883635712L, 18014398509481984L, 84590643846578176L, 316478381828866048L, 1000000000000000000L, 2773078757450186752L});
  }
}
