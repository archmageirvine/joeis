package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000798;

/**
 * A006058 Number of connected labeled T_4-topologies with n points.
 * @author Sean A. Irvine
 */
public class A006058 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final A000798 seq = new A000798();
    for (long k = 0; k < mN; k++) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(seq.next()));
    }
    return sum;
  }
}

