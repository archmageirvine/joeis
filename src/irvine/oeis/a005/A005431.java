package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005431 Embeddings of n-bouquet in sphere.
 * @author Sean A. Irvine
 */
public class A005431 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = mA.multiply(mN - 2).multiply(2 * mN - 3).multiply(4).divide(mN);
    }
    return mA;
  }
}
