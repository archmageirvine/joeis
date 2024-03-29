package irvine.oeis.a174;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A174317 a(0)=1, a(1)=2, a(2)=1; for n&gt;2, a(n) = 7*2^(n-3)-2.
 * @author Georg Fischer
 */
public class A174317 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174317() {
    super(0, "[0, 2,-3, 1]", "[1, 2, 1, 5, 12]", 0);
  }
}
