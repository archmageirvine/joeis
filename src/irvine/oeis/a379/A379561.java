package irvine.oeis.a379;
// manually 2025-09-12

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A379561 a(n) = A003418(n+1)*H(n), where H(n) = 1 + 1/2 + ... + 1/n is the n-th harmonic number.
 * @author Georg Fischer
 */
public class A379561 extends AbstractSequence {

  private int mN;
  private Q mHn; // harmonic numbers
  private Z mLcm; // least common multiple

  /** Construct the sequence. */
  public A379561() {
    super(1);
    mN = 0;
    mHn = Q.ZERO;
    mLcm = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    mHn = mHn.add(new Q(1, mN));
    mLcm = Functions.LCM.z(mLcm, Z.valueOf(mN + 1));
    return mHn.multiply(mLcm).num();
  }
}
