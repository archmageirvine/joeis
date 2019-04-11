package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004983 <code>a(n) = (2^n/n!) *</code> Product_{k=0..n-1} (4*k <code>- 3)</code>.
 * @author Sean A. Irvine
 */
public class A004983 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4 * mN - 7).multiply2().divide(mN);
    }
    return mA;
  }
}

