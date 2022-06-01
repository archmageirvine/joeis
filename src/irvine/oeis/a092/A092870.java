package irvine.oeis.a092;
// manually 2021-01-21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A092870 Expansion of Hypergeometric function F(1/12, 5/12; 1; 1728*x) in powers of x.
 * a(n) * n^2 = a(n-1) * 12 * (12*n - 7) * (12*n - 11)
 *
 * @author Georg Fischer
 */
public class A092870 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A092870() {
    super(0, "[[0],[-924, 2592,-1728],[0, 0, 1]]", "1", 0);
  }
}
