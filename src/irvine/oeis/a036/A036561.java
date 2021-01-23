package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036561 Triangle of numbers in which i-th row is {2^(i-j)*3^j, 0&lt;=j&lt;=i}; i &gt;= 0.
 * @author Sean A. Irvine
 */
public class A036561 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private Z mA = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mA = null;
    }
    mA = mA == null ? Z.ONE : mA.multiply(3);
    return mA.shiftLeft(mN - mM);
  }
}
