package irvine.oeis.a055;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A055485 Number of unlabeled 3-element intersecting families (with distinct sets) of an n-element set.
 * @author Sean A. Irvine
 */
public class A055485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055485() {
    super(3, new long[] {1, -3, -1, 9, 0, -12, -7, 15, 16, -16, -15, 7, 12, 0, -9, 1, 3}, new long[] {4, 19, 61, 157, 353, 717, 1355, 2412, 4094, 6676, 10524, 16108, 24036, 35063, 50135, 70409, 97295});
  }
}
