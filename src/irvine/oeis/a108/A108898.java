package irvine.oeis.a108;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108898 a(n+3) = 3*a(n+2) - 2*a(n), a(0) = -1, a(1) = 1, a(2) = 3.
 * @author Georg Fischer
 */
public class A108898 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108898() {
    super(0, "[[0],[2],[0],[-3],[1]]", "[-1, 1, 3, 11]", 3);
  }
}
