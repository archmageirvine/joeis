package irvine.oeis.a122;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A122254 Numbers with 3-smooth Euler's totient (A000010).
 * @author Sean A. Irvine
 */
public class A122254 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Cheetah.factor(Cheetah.factor(++mN).phi()).toZArray();
      if (p.length == 0 || p[p.length - 1].compareTo(Z.THREE) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
