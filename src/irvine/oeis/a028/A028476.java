package irvine.oeis.a028;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028476 Greatest k such that <code>phi(k) = phi(n)</code>, where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A028476 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return Euler.inversePhi(Euler.phi(mN)).last();
  }
}
