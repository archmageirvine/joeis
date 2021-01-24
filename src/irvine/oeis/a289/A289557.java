package irvine.oeis.a289;
// manually 2021-01-21

import irvine.oeis.HolonomicRecurrence;

/**
 * A289557 Expansion of Hypergeometric function F(1/12, 7/12; 1; 1728*x) in powers of x.
 * a(n) * n^2 = a(n-1) * 12 * (12*n - 5) * (12*n - 11).
 *
 * @author Georg Fischer
 */
public class A289557 extends HolonomicRecurrence {

  /**
   * Construct the sequence.
   */
  public A289557() {
    super(0, "[[0],[-660, 2304,-1728],[0, 0, 1]]", "1, 84", 0);
  }
}
