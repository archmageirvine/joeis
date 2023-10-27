package irvine.oeis.a278;
// manually A069877/parmof2 at 2023-07-26 12:08

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a005.A005940;

/**
 * A278222 The least number with the same prime signature as A005940(n+1).
 * @author Georg Fischer
 */
public class A278222 extends AbstractSequence implements DirectSequence {

  private final A005940 mSeq = new A005940();
  private int mN;

  /** Construct the sequence. */
  public A278222() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    return FactorUtils.leastPrimeSignature(mSeq.a(n + 1));
  }

  @Override
  public Z a(final Z n) {
    return FactorUtils.leastPrimeSignature(mSeq.a(n.add(1)));
  }

}
