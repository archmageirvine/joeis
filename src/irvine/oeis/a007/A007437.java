package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007437 Inverse Moebius transform of triangular numbers.
 * @author Sean A. Irvine
 */
public class A007437 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(d.multiply(d.add(1)).divide2());
    }
    return sum;
  }
}
