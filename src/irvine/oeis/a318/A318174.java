package irvine.oeis.a318;
// manually 2021-01-21

import irvine.oeis.HolonomicRecurrence;

/**
 * A318174 Expansion of Hypergeometric function F(5/12, 13/12; 2; 1728*x) in powers of x.
 * a(n)*n*(n+1) = a(n-1)*12*(12*(n-1)+5)*(12*(n-1)+13).
 *
 * @author Georg Fischer
 */
public class A318174 extends HolonomicRecurrence {

  /**
   * Construct the sequence.
   */
  public A318174() {
    super(0, "[[0],[84, 864,-1728],[0, 1, 1]]", "1", 0);
  }
}
