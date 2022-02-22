package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A063113 a(1) = 1; a(n+1) = a(n) + product of nonzero digits of a(n) when written in base 3. But display sequence in base 10.
 * @author Georg Fischer
 */
public class A063113 implements Sequence {

  private int mN = 0;
  private Z mA_1 = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    final Z result = ZUtils.digitNZProduct(mA_1, 3).add(mA_1);
    mA_1 = result;
    return result;
  }
}
