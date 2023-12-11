package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001610;
import irvine.oeis.memory.MemorySequence;

/**
 * A032190 Number of cyclic compositions of n into parts &gt;= 2.
 * @author Sean A. Irvine
 */
public class A032190 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A001610());
  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(mA.a(d - 1).multiply(Euler.phiAsLong(mN / d)));
    }
    return sum.divide(mN);
  }
}
