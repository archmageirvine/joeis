package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095889 Number of permutations of [n] with exactly 3 descents which avoid the pattern 4321.
 * @author Sean A. Irvine
 */
public class A095889 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095889() {
    super(new long[] {648, -4428, 13446, -23937, 27752, -22004, 12180, -4710, 1248, -216, 22}, new long[] {10, 148, 1260, 8160, 44790, 220180, 1001000, 4295168, 17633122, 69921460, 269652100});
  }
}
