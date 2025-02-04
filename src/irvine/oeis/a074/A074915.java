package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a048.A048864;
import irvine.util.array.LongDynamicLongArray;

/**
 * A074915 Largest x such that the number of nonprimes (i.e., 1 and composites) in the reduced residue set (RRS(x)) of x equals n, or 0 if there are no such numbers.
 * @author Sean A. Irvine
 */
public class A074915 extends A048864 {

  private final LongDynamicLongArray mMax = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final long t = 2 * Functions.SQRT.l(2 * ++mN) + 1;
    while (Functions.PRIME_PI.l(Functions.SQRT.l(mM)) <= t) {
      mMax.set(super.next().longValueExact(), ++mM);
    }
    return Z.valueOf(mMax.get(mN));
  }
}
