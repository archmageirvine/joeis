package irvine.oeis.a058;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058321 Number of x such that phi(x) = 2^n.
 * @author Sean A. Irvine
 */
public class A058321 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return Z.valueOf(InverseEuler.inversePhi(mN).size());
  }
}

