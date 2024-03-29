package irvine.oeis.a132;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A132343 Output of Knuth's "man or boy" test for varying k.
 * @author Georg Fischer
 */
public class A132343 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A132343() {
    super(0, "[0,-1, 6,-11, 10,-5, 1]", "[1, 0,-2, 0, 1, 0, 1,-1,-10,-30]", 0);
  }
}
