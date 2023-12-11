package irvine.oeis.a284;
// manually posins at 2021-09-24 09:16

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a010.A010060;
import irvine.oeis.base.MorphismTransform;

/**
 * A284847 Positions of 1 in the {1100-&gt;0}-transform of A010060; complement of A284820.
 * @author Georg Fischer
 */
public class A284847 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A284847() {
    super(1, new MorphismTransform(new A010060(), "1100->0"), 1);
  }
}
