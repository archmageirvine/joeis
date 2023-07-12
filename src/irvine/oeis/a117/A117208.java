package irvine.oeis.a117;
// manually 2023-07-09

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;
import irvine.oeis.transform.GeneralizedEulerTransform;


/**
 * A117208 G.f. A(x) satisfies (1-x) = product_{n&gt;=1} A(x^n).
 * @author Georg Fischer
 */
public class A117208 extends GeneralizedEulerTransform {

  /** Construct the sequence. */
  public A117208() {
    super(0, 1);
    mSeqF = new A008683();
  }

  @Override
  protected Z[] advanceF(final long k) {
    return new Z[]{mSeqF.next().negate()};
  }
}
