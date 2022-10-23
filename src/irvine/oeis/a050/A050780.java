package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050780 Numbers k such that sopfr(k) = sopfr(k + sopfr(k)).
 * @author Sean A. Irvine
 */
public class A050780 extends Sequence1 {

  private long mN = 38;

  @Override
  public Z next() {
    while (true) {
      final Z sopfr = Jaguar.factor(++mN).sopfr();
      if (sopfr.equals(Jaguar.factor(sopfr.add(mN)).sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
