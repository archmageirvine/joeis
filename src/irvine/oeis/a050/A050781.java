package irvine.oeis.a050;

import irvine.math.function.Functions;
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
      final Z sopfr = Functions.SOPFR.z(++mN);
      if (sopfr.equals(Functions.SOPFR.z(Z.valueOf(mN).subtract(sopfr)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
