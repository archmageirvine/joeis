package irvine.oeis.a063;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063667 Number of solutions of EulerPhi(x) = 12n + 2.
 * @author Sean A. Irvine
 */
public class A063667 extends Sequence0 {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    mN = mN.add(12);
    return Z.valueOf(Euler.inversePhi(mN).size());
  }
}
