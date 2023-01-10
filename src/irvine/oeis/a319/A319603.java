package irvine.oeis.a319;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A319603 a(n) = n^3 + reversal of digits of n^3.
 * @author Georg Fischer
 */
public class A319603 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z cube = Z.valueOf(mN).multiply(mN).multiply(mN);
    return cube.add(ZUtils.reverse(cube));
  }
}
