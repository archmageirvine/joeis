package irvine.oeis.a330;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A330130 Number of length-n binary words having no even palindromes of length &gt; 2 and no odd palindromes of length &gt; 5.
 * @author Georg Fischer
 */
public class A330130 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330130() {
    super(0, "[0,-1, 0,-1, 0, 0, 0, 0, 0, 0, 0, 1]", "[1, 2, 4, 8, 12, 18, 26, 28, 30, 32, 34, 36, 40, 44, 48, 52]", 0);
  }
}
