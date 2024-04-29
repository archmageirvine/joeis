package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000142 Factorial numbers: n! = 1*2*3*4*...*n (order of symmetric group S_n, number of permutations of n letters).
 * @author Sean A. Irvine
 */
public class A000142 extends Sequence0 implements DirectSequence {

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

  @Override
  public Z a(final Z n) {
    return Functions.FACTORIAL.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.FACTORIAL.z(n);
  }

}

