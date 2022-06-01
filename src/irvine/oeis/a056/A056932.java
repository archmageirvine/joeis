package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056932 Antichains (or order ideals) in the poset 2*2*2*n or size of the distributive lattice J(2*2*2*n).
 * @author Sean A. Irvine
 */
public class A056932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056932() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 20, 168, 887, 3490, 11196, 30900, 75966, 170379});
  }
}
