package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017540 a(n) = (12*n + 1)^8.
 * @author Sean A. Irvine
 */
public class A017540 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017540() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 815730721, 152587890625L, 3512479453921L, 33232930569601L, 191707312997281L, 806460091894081L, 2724905250390625L, 7837433594376961L});
  }
}
