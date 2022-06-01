package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017035 a(n) = (7*n + 4)^7.
 * @author Sean A. Irvine
 */
public class A017035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017035() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 19487171, 612220032, 6103515625L, 34359738368L, 137231006679L, 435817657216L, 1174711139837L});
  }
}
