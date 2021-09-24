package irvine.oeis.a284;
// manually posins at 2021-09-24 09:16

import irvine.oeis.MorphismTransform;
import irvine.oeis.PositionSequence;
import irvine.oeis.a010.A010060;

/**
 * A284847 Positions of 1 in A284792; complement of A284820.
 * @author Georg Fischer
 */
public class A284847 extends PositionSequence {

  /** Construct the sequence. */
  public A284847() {
    super(1, new MorphismTransform(new A010060(), "1100->0"), 1);
  }
}
