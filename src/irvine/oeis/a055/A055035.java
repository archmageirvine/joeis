package irvine.oeis.a055;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055035 Degree of minimal polynomial of sin(Pi/n) over the rationals.
 * @author Sean A. Irvine
 */
public class A055035 implements Sequence {

  private long mN;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    final Z phi = Euler.phi(Z.valueOf(mN));
    return (mN & 3) == 2 ? phi.divide2() : phi;
  }
}
