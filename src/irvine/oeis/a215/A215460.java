package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A215460 Floor(n!^2 / n^n).
 * @author Georg Fischer
 */
public class A215460 extends Sequence1 {

  private int mN = 0;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    return mFact.square().divide(Z.valueOf(mN).pow(mN));
  }
}
