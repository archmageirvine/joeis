package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067055 a(n) = (n!)^(n*(n+1)/2).
 * @author Georg Fischer
 */
public class A067055 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 0) {
      mF = mF.multiply(mN);
    }
    return mF.pow(mN * (mN + 1) / 2);
  }
}
