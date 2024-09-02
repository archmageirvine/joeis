package irvine.oeis.a072;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072075 Smallest solution to phi(x) = 10^n where phi(x) = A000010(x).
 * @author Sean A. Irvine
 */
public class A072075 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return InverseEuler.inversePhi(mA).first();
  }
}
