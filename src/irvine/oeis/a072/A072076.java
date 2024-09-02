package irvine.oeis.a072;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072076 Largest k such that EulerPhi(k) = 10^n.
 * @author Sean A. Irvine
 */
public class A072076 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    return InverseEuler.inversePhi(mA).last();
  }
}
