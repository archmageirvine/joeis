package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242510 Number of n-length words on {1,2,3} such that the maximal blocks (runs) of 1's have odd length, the maximal blocks of 2's have even length and the maximal blocks of 3's have odd length.
 * @author Sean A. Irvine
 */
public class A242510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242510() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 2, 3, 8});
  }
}
