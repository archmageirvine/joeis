package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003777 <code>a(n) = n^3 + n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A003777 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z s = mN.square();
    return s.multiply(mN).add(s).subtract(1);
  }
}
