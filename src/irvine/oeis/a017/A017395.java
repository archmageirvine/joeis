package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017395 a(n) = (11*n)^7.
 * @author Sean A. Irvine
 */
public class A017395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017395() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 19487171, 2494357888L, 42618442977L, 319277809664L, 1522435234375L, 5455160701056L, 16048523266853L});
  }
}
