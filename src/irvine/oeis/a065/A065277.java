package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065277 A065275 conjugated with A059893, inverse of A065278.
 * @author Sean A. Irvine
 */
public class A065277 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return A065265.specialReverse(A065275.compute(A065265.specialReverse(Z.valueOf(++mN)).longValueExact()));
  }
}
