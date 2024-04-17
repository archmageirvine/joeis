package irvine.oeis.a050;

import irvine.math.function.Functions;
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
      final Z sopfr = Functions.SOPFR.z(++mN);
      if (sopfr.equals(Functions.SOPFR.z(sopfr.add(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
