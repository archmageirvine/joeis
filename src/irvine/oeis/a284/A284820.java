package irvine.oeis.a284;
// manually posins at 2021-09-24 09:16

import irvine.oeis.MorphismTransform;
import irvine.oeis.PositionSequence;
import irvine.oeis.a010.A010060;

/**
 * A284820 Positions of 0 in A284792; complement of A284847.
 * @author Georg Fischer
 */
public class A284820 extends PositionSequence {

  /** Construct the sequence. */
  public A284820() {
    super(1, new MorphismTransform(new A010060(), "1100->0"), 0);
  }
}
