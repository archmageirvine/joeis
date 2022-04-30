package irvine.oeis.a282;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007306;

/**
 * A282720 Number of nonzero terms in first n rows of the base-2 generalized Pascal triangle P_2 (see A282714).
 * @author Georg Fischer
 */
public class A282720 extends PrependSequence {

  /** Construct the sequence. */
  public A282720() {
    super(new PartialSumSequence(new SkipSequence(new A007306(), 1)), 0);
  }
}
