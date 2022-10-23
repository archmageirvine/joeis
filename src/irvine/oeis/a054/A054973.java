package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A054973 Number of numbers whose divisors sum to n.
 * @author Sean A. Irvine
 */
public class A054973 extends Sequence1 {

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long sigma = Jaguar.factor(++mN).sigma().longValueExact();
    mA.set(sigma, mA.get(sigma) + 1);
    return Z.valueOf(mA.get(mN));
  }
}
