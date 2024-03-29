package irvine.oeis.a329;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329774 a(n) = n+1 for n &lt;= 2; otherwise a(n) = 3*a(n-3)+1.
 * @author Georg Fischer
 */
public class A329774 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329774() {
    super(0, "[0, 3,-3, 0,-1, 1]", "[1, 2, 3, 4]", 0);
  }
}
