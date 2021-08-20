package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050781 Numbers k such that sopfr(k) = sopfr(k - sopfr(k)).
 * @author Sean A. Irvine
 */
public class A050781 implements Sequence {

  private long mN = 54;

  @Override
  public Z next() {
    while (true) {
      final Z sopfr = Cheetah.factor(++mN).sopfr();
      if (sopfr.equals(Cheetah.factor(Z.valueOf(mN).subtract(sopfr)).sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
