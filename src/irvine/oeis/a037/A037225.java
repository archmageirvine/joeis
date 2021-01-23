package irvine.oeis.a037;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037225 a(n) = phi(2n+1).
 * @author Sean A. Irvine
 */
public class A037225 implements Sequence {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Euler.phi(mN);
  }
}
