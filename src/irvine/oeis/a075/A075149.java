package irvine.oeis.a075;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075149 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int r = 2 * (mN - (1 << IntegerUtils.floorLog2(mN)));
    return Integers.SINGLETON.sum(0, 2 * r, k -> Functions.FIBONACCI.z(mN - k).multiply(Binomial.binomial(r, k, 2)));
  }
}
