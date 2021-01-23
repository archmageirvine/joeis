package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028380 a_n = - sum_{i=1..n-1} C(i+1, n-i) (-1)^(n-i) a_i.
 * @author Sean A. Irvine
 */
public class A028380 implements Sequence {

  // Using interpretation of R. J. Mathar
  // Do not use this to extend the sequence

  private long mN = -1;
  private Z mA = Z.valueOf(28);

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ZERO;
    } else if (mN > 1) {
     mA = mA.multiply(9 * mN + 19).multiply(2 * mN + 3).multiply(mN).multiply2().divide(mN - 1).divide(9 * mN + 10).divide(mN + 5);
    }
    return mA;
  }
}

