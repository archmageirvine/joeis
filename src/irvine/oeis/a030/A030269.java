package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a006.A006966;

/**
 * A030269 Number of nonisomorphic disconnected partial lattices.
 * @author Sean A. Irvine
 */
public class A030269 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A030269() {
    super(new A006966(), 3, Z.ONE);
  }

  @Override
  public Z next() {
    return super.next().subtract(mTerms.get(mTerms.size() - 1)).negate().max(Z.ZERO);
  }
}
