package irvine.oeis.a318;
// manually 2021-01-21

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A318201 Expansion of Hypergeometric function F(17/12, 25/12; 4; 1728*x) in powers of x.
 * a(n)*n*(n+3) = a(n-1)*12*(12*(n-1)+17)*(12*(n-1)+25).
 *
 * @author Georg Fischer
 */
public class A318201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318201() {
    super(0, "[[0],[-780,-2592,-1728],[0, 3, 1]]", "1", 0);
  }
}
