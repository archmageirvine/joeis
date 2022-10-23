package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053864 A second order generalization of the Mobius function of n.
 * @author Sean A. Irvine
 */
public class A053864 extends Sequence1 {

  private final int mK;
  private long mN = 0;

  protected A053864(final int k) {
    mK = k;
  }

  /** Construct the sequence. */
  public A053864() {
    this(2);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    if (fs.maxExponent() > mK) {
      return Z.ZERO;
    }
    if (fs.minExponent() < mK) {
      return Z.ONE;
    }
    return (fs.omega() & 1) == 1 ? Z.NEG_ONE : Z.ONE;
  }
}
