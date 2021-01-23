package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017203 a(n) = (9*n + 3)^7.
 * @author Sean A. Irvine
 */
public class A017203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017203() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {2187, 35831808, 1801088541, 21870000000L, 137231006679L, 587068342272L, 1954897493193L, 5455160701056L});
  }
}
