package irvine.oeis.a074;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A074826 Binomial transform of reflected pentanacci numbers A074062: a(n) = Sum_{k=0..n}(-1)^k*binomial(n, k)*A074062(k).
 * @author Georg Fischer
 */
public class A074826 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A074826() {
    super(0, "[[0],[-4],[15],[-20],[15],[-6],[1]]", "[5, 6, 6, 6, 6,-4]", 0);
  }
}
