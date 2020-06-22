package irvine.oeis.a032;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032446 Number of solutions to <code>phi(k) = 2n</code>.
 * @author Sean A. Irvine
 */
public class A032446 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}
