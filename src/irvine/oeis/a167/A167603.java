package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167603 Expansion of 1/(1 + 837*x + 277760*x^2 + 83891456*x^3 + 7809531904*x^4).
 * @author Sean A. Irvine
 */
public class A167603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167603() {
    super(new long[] {-7809531904L, -83891456, -277760, -837}, new long[] {1, -837, 422809, -205297469});
  }
}
