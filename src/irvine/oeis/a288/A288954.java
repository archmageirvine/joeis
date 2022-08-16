package irvine.oeis.a288;
// manually at 2022-08-15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A288954 Number of relaxed compacted binary trees of right height at most one with minimal sequences between branch nodes except before the first and after the last branch node on level 0.
 * E.g.f. 1/(3*(1-z))*( 1/sqrt(1-z^2) + (3*z^3-z^2-2*z+2)/((1-z)*(1-z^2)) ).
 * @author Georg Fischer
 */
public class A288954 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A288954() {
    super(0, "[[0],[6,-5, 1],[-10, 11,-3],[1,-4, 1],[1,-8, 3],[0, 6,-2]]", "[1, 1, 3, 13]", 0);
    setGfType(1);
  }

  @Override
  public int getOffset() {
    return 2;
  }
}
