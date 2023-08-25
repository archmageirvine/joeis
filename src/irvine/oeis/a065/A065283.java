package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065283 A065281 conjugated with A059893, inverse of A065284.
 * @author Sean A. Irvine
 */
public class A065283 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return A065265.specialReverse(A065281.compute(A065265.specialReverse(Z.valueOf(++mN)).longValueExact()));
  }
}
