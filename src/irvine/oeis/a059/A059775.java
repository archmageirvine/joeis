package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059775 From solution to a counting problem.
 * @author Sean A. Irvine
 */
public class A059775 extends Sequence0 {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN - 1).multiply(n.square().subtract(mN + 1))
      .add(Integers.SINGLETON.sum(2, Functions.SQRT.i(mN), k -> Z.valueOf(Functions.PHI.l(k) * (mN / ((long) k * k)))).multiply(4))
      .subtract(Integers.SINGLETON.sum(2, mN, k -> Z.valueOf(Functions.PHI.l(k) * (mN / k) * (mN / k))).multiply2());
  }
}

