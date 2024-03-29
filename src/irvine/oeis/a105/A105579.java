package irvine.oeis.a105;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105579 a(n+3) = 2a(n+2) - 3a(n+1) + 2a(n); a(0) = 1, a(1) = 3, a(2) = 4.
 * @author Georg Fischer
 */
public class A105579 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105579() {
    super(0, "[[0],[-2],[3],[-2],[1]]", "[1, 3, 4, 1]", 3);
  }
}
