package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A078142 a(n) is the sum of the differences of the distinct prime factors p of n and the next square larger than p.
 * @author Sean A. Irvine
 */
public class A078142 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z p : Jaguar.factor(n).toZArray()) {
      sum = sum.add(Functions.CEIL_SQRT.z(p).square().subtract(p));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
