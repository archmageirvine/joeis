package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064678 Numbers k such that sopf(k) = sopfr(k+1), where sopf(k) = A008472(k) and sopfr(k) = A001414(k).
 * @author Sean A. Irvine
 */
public class A064678 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).equals(Functions.SOPFR.z(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
