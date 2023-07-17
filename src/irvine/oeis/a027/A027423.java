package irvine.oeis.a027;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027423 Number of divisors of n!.
 * @author Sean A. Irvine
 */
public class A027423 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027423(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027423() {
    super(0);
  }

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = -1;

  @Override
  public Z next() {
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(++mN)));
    return mFactorSequence.sigma0();
  }
}
