package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036502 Numerator of n^(n-2)/n!.
 * @author Sean A. Irvine
 */
public class A036502 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return new Q(Z.valueOf(mN).pow(mN - 2), mF).num();
  }
}
