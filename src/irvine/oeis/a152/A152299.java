package irvine.oeis.a152;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A152299 A threes sequence that gets more even factors out: a(n)=(3^n - 1)*(3^n + 1)/2^(4 - Mod[n, 2]).
 * @author Georg Fischer
 */
public class A152299 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A152299() {
    super(0, "[[0],[81],[0],[-82],[0],[1]]", "[1, 5, 91, 410, 7381]", 0);
  }
}
