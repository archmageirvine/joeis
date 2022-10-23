package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050781 Numbers k such that sopfr(k) = sopfr(k - sopfr(k)).
 * @author Sean A. Irvine
 */
public class A050781 extends Sequence0 {

  private long mN = 54;

  @Override
  public Z next() {
    while (true) {
      final Z sopfr = Jaguar.factor(++mN).sopfr();
      if (sopfr.equals(Jaguar.factor(Z.valueOf(mN).subtract(sopfr)).sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
