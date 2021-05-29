package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;
import irvine.util.array.LongDynamicLongArray;

/**
 * A047983 Number of integers less than n but with the same number of divisors.
 *
 * @author Sean A. Irvine
 */
public class A047983 extends A000005 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();

  @Override
  public Z next() {
    final long d = super.next().longValueExact();
    final long res = mA.get(d);
    mA.set(d, res + 1);
    return Z.valueOf(res);
  }
}
