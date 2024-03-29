package irvine.oeis.a212;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212896 Number of (w,x,y,z) with all terms in {0,...,n} and (least gapsize)&lt;2.
 * @author Georg Fischer
 */
public class A212896 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212896() {
    super(0, "[0, 1,-4, 6,-4, 1]", "[1, 16, 79, 240, 551, 1066]", 0);
  }
}
