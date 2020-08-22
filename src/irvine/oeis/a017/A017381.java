package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017381 a(n) = (10*n + 9)^5.
 * @author Sean A. Irvine
 */
public class A017381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017381() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {59049, 2476099, 20511149, 90224199, 282475249, 714924299});
  }
}
