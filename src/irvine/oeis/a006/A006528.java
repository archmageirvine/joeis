package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006528 a(n) = (n^4 + n^2 + 2*n)/4.
 * @author Sean A. Irvine
 */
public class A006528 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.square().add(s).add(mN.multiply2()).divide(4);
  }
}
