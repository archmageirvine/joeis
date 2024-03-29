package irvine.oeis.a109;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A109539 a(n) = a(n-2)+a(n-3)+a(n-4)+a(n-5)+a(n-6)+a(n-7)+a(n-8).
 * @author Georg Fischer
 */
public class A109539 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A109539() {
    super(0, "[[0],[-1],[-1],[-1],[-1],[-1],[-1],[-1],[0],[1]]", "[1, 1, 1, 1, 1, 1, 1, 1, 7]", 0);
  }
}
