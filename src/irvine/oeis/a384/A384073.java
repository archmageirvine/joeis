package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384073 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A384073 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z d = Functions.SIGMA0.z(++mN);
      if (d.modPow(d, Z.valueOf(mN)).equals(d.modZ(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
