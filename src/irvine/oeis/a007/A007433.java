package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007433 Inverse Moebius transform applied twice to squares.
 * @author Sean A. Irvine
 */
public class A007433 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      sum = sum.add(Cheetah.factor(d).sigma(2));
    }
    return sum;
  }
}
