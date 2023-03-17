package irvine.oeis.a122;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A122254 Numbers with 3-smooth Euler's totient (A000010).
 * @author Sean A. Irvine
 */
public class A122254 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Jaguar.factor(Euler.phi(++mN)).toZArray();
      if (p.length == 0 || p[p.length - 1].compareTo(Z.THREE) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
