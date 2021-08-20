package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050780 Numbers k such that sopfr(k) = sopfr(k + sopfr(k)).
 * @author Sean A. Irvine
 */
public class A050780 implements Sequence {

  private long mN = 38;

  @Override
  public Z next() {
    while (true) {
      final Z sopfr = Cheetah.factor(++mN).sopfr();
      if (sopfr.equals(Cheetah.factor(sopfr.add(mN)).sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
