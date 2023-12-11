package irvine.oeis.a293;
// manually 2020-12-30

import irvine.math.z.Z;
import irvine.oeis.a049.A049401;
import irvine.oeis.transform.GeneralizedEulerTransform;

/**
 * A293735 Number of multisets of nonempty words with a total of n letters over quinary alphabet such that within each prefix of a word every letter of the alphabet is at least as frequent as the subsequent alphabet letter.
 * G.f.: <code>Product_{k&gt;=1} (1/(1-x^k)^A049401(k))</code>
 * @author Georg Fischer
 */
public class A293735 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A293735() {
    super(0, 1);
    mSeqF = new A049401();
    mSeqF.next();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{ mSeqF.next() };
  }

}
