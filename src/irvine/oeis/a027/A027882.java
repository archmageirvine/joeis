package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027882 a(n) = Sum_{k&gt;=1} k^n (2/3)^k.
 * @author Sean A. Irvine
 */
public class A027882 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (int k = 1; k <= mN; kf = kf.multiply(k++)) {
      sum = sum.add(kf.multiply(Functions.STIRLING2.z(mN, k)).shiftLeft(k));
    }
    return sum;
  }
}
