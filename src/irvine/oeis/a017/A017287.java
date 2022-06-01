package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017287 a(n) = (10*n + 1)^7.
 * @author Sean A. Irvine
 */
public class A017287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017287() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 19487171, 1801088541, 27512614111L, 194754273881L, 897410677851L, 3142742836021L, 9095120158391L});
  }
}
