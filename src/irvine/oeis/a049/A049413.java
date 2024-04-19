package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049413 Largest prime dividing Sum_{k=0..n} k! * (n-k)!.
 * @author Sean A. Irvine
 */
public class A049413 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(mN - k)));
    }
    final Z[] p = Jaguar.factor(sum).toZArray();
    return p[p.length - 1];
  }
}
