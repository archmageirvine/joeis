package irvine.oeis.a212;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212905 Number of (w,x,y,z) with all terms in {0,...,n} and |w-x|+|x-y+|y-z|=2n.
 * @author Georg Fischer
 */
public class A212905 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212905() {
    super(0, "[[0],[1],[-2],[-1],[4],[-1],[-2],[1]]", "[1, 6, 16, 26, 42, 58, 82]", 0);
  }
}
