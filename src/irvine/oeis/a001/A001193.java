package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001193.
 * @author Sean A. Irvine
 */
public class A001193 implements Sequence {

  private long mN = -1;
  private Z mDF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mDF = mDF.multiply(2 * mN - 1);
    }
    return mDF.multiply(mN + 1);
  }
}
