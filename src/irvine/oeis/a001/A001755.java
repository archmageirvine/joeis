package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001755 Lah numbers: <code>n! *</code> binomial(n-1, <code>3)/4!</code>.
 * @author Sean A. Irvine
 */
public class A001755 implements Sequence {

  private long mN = 3;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 1).multiply(mN - 2).multiply(mN - 3).divide(144);
  }
}
