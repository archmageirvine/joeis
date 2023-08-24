package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065271 A065269 conjugated with A059893, inverse of A065272.
 * @author Sean A. Irvine
 */
public class A065271 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return A065265.specialReverse(A065269.compute(A065265.specialReverse(Z.valueOf(++mN)).longValueExact()));
  }
}
