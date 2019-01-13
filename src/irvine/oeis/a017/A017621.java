package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017621.
 * @author Sean A. Irvine
 */
public class A017621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017621() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {32768, 3200000, 33554432, 164916224, 550731776, 1453933568});
  }
}
