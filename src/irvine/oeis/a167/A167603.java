package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167603.
 * @author Sean A. Irvine
 */
public class A167603 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167603() {
    super(new long[] {-7809531904L, -83891456, -277760, -837}, new long[] {1, -837, 422809, -205297469});
  }
}
