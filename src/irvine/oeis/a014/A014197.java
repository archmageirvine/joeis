package irvine.oeis.a014;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014197 Number of numbers m with Euler phi(m) = n.
 * @author Sean A. Irvine
 */
public class A014197 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}
