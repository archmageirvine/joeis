package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028476 Greatest k such that phi(k) = phi(n), where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A028476 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return InverseEuler.inversePhi(Functions.PHI.z(mN)).last();
  }
}
