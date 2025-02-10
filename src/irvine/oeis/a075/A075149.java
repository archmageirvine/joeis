package irvine.oeis.a075;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075149 Sum_{i=0..2*A053645(n)} (C(2*A053645(n),i) mod 2)*A000045(n-i) [where C(r,c) is the binomial coefficient (A007318) and A000045(n) is the n-th Fibonacci number].
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
