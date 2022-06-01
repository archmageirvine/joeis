package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017333 a(n) = (10*n + 5)^5.
 * @author Sean A. Irvine
 */
public class A017333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017333() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3125, 759375, 9765625, 52521875, 184528125, 503284375});
  }
}
