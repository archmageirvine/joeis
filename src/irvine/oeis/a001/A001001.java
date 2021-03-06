package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001001 Number of sublattices of index n in generic 3-dimensional lattice.
 * @author Sean A. Irvine
 */
public class A001001 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      s = s.add(d.multiply(Cheetah.factor(d).sigma()));
    }
    return s;
  }
}
