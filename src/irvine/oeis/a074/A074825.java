package irvine.oeis.a074;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A074825 Binomial transform of reflected pentanacci numbers A074062: a(n) = Sum_{k=0..n} binomial(n,k)*A074062(k).
 * @author Georg Fischer
 */
public class A074825 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A074825() {
    super(0, "[[0],[-2],[3],[-6],[7],[-4],[1]]", "[5, 4, 2,-2,-10,-16]", 0);
  }
}
