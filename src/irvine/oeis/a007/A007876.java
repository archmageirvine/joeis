package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007876 <code>a(2n-1) = n*a(2n-2), a(2n) = n*a(2n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A007876 implements Sequence {

  private int mN = 0;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN > 2) {
      mA = mA.multiply((mN + 1) / 2).add(1 - (mN & 1));
    }
    return mA;
  }
}
