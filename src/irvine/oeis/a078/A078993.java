package irvine.oeis.a078;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A078993 Starting at the chess position shown, a(n) is the number of ways Black can make n consecutive moves, followed by a checkmate in one move by White.
 * @author Georg Fischer
 */
public class A078993 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A078993() {
    super(0, "[0, 2, 0,-9, 0, 12, 0,-6, 0, 1]", "[0, 0, 0, 0, 0, 2, 5, 8, 28]", 0);
  }
}
