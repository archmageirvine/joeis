package irvine.oeis.a032;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032446 Number of solutions to phi(k) = 2n.
 * @author Sean A. Irvine
 */
public class A032446 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}
