package irvine.oeis.a188;
// manually posins at 2021-09-24 09:16

import irvine.math.cr.CR;
import irvine.oeis.FilterPositionSequence;

/**
 * A188383 Positions of 1 in the zero-one sequence [nr+3r]-[nr]-[3r], where r=1/sqrt(2).
 * @author Georg Fischer
 */
public class A188383 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A188383() {
    super(1, new A188374(3, CR.ONE.divide(CR.SQRT2)), 1);
  }
}
