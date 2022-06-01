package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256235 Sum of all the parts in the partitions of 5n into 5 parts.
 * @author Sean A. Irvine
 */
public class A256235 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256235() {
    super(new long[] {-1, 1, 1, 1, 0, -4, -1, -1, 4, 4, -1, -1, -4, 0, 1, 1, 1}, new long[] {0, 5, 70, 450, 1680, 4800, 11310, 23590, 44600, 78615, 130550, 207075, 315600, 465790, 667940, 935250, 1281520});
  }
}
