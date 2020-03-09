package irvine.oeis.a029;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029908 Starting with n, repeatedly sum prime factors (with multiplicity) until reaching 0 or a fixed point.
 * @author Sean A. Irvine
 */
public class A029908 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z prev;
    do {
      prev = m;
      m = Cheetah.factor(m).sopfr();
    } while (!Z.ZERO.equals(m) && !prev.equals(m));
    return m;
  }
}
