package irvine.oeis.a059;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059775 From solution to a counting problem.
 * @author Sean A. Irvine
 */
public class A059775 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN - 1).multiply(n.square().subtract(mN + 1))
      .add(Integers.SINGLETON.sum(2, IntegerUtils.sqrt(mN), k -> Z.valueOf(LongUtils.phi(k) * (mN / (k * k)))).multiply(4))
      .subtract(Integers.SINGLETON.sum(2, mN, k -> Z.valueOf(LongUtils.phi(k) * (mN / k) * (mN / k))).multiply2());
  }
}

