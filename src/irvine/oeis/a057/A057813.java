package irvine.oeis.a057;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A057813 a(n) = (2*n+1)*(4*n^2+4*n+3)/3.
 * @author Georg Fischer
 */
public class A057813 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A057813() {
    super(0, "[0, 1,-4, 6,-4, 1]", "[1, 11, 45, 119]", 0);
  }
}
