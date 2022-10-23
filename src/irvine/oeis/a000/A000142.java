package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000142 Factorial numbers: n! = 1*2*3*4*...*n (order of symmetric group S_n, number of permutations of n letters).
 * @author Sean A. Irvine
 */
public class A000142 extends Sequence0 {

  protected long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    return mF;
  }
}

