package irvine.oeis.a318;
// manually 2021-01-21

import irvine.oeis.HolonomicRecurrence;

/**
 * A318200 Expansion of Hypergeometric function F(17/12, 13/12; 3; 1728*x) in powers of x.
 * a(n)*(n*(n+2)) = a(n-1)*12*(12*(n-1)+17)*(12*(n-1)+13).
 *
 * @author Georg Fischer
 */
public class A318200 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A318200() {
    super(0, "[[0],[-60,-864,-1728],[0, 2, 1]]", "1", 0);
  }
}
