package irvine.oeis.a293;
// manually 2020-12-30

import irvine.math.z.Z;
import irvine.oeis.GeneralizedEulerTransform;
import irvine.oeis.a212.A212916;

/**
 * A293740 Number of multisets of nonempty words with a total of n letters over denary alphabet such that within each prefix of a word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^A212916(k))</code>
 * @author Georg Fischer
 */
public class A293740 extends GeneralizedEulerTransform {

  /**
   * Construct the sequence.
   */
  public A293740() {
    super(0, 1);
    mSeqF = new A212916();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{ mSeqF.next() };
  }

}
