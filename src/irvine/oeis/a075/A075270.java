package irvine.oeis.a075;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A075270 Sum of Lucas numbers and inverted Lucas numbers: a(n) = A000032(n)*A075193(n).
 * @author Georg Fischer
 */
public class A075270 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A075270() {
    super(0, "[[0],[1],[0],[-3],[0],[1]]", "[3,-2, 7,-3, 18]", 0);
  }
}
