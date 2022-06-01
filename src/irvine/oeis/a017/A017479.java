package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017479 a(n) = (11*n + 7)^7.
 * @author Sean A. Irvine
 */
public class A017479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017479() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {823543, 612220032, 17249876309L, 163840000000L, 897410677851L, 3521614606208L, 11047398519097L, 29509034655744L});
  }
}
