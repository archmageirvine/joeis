package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008911 a(n) = n^2*(n^2 - 1)/6.
 * @author Sean A. Irvine
 */
public class A008911 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.multiply(s.subtract(1)).divide(6);
  }
}

