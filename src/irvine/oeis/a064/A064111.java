package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064111 Numbers k such that sopf(k) + 1 = sopf(k+1), where sopf(k) = A008472(k).
 * @author Sean A. Irvine
 */
public class A064111 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).add(1).equals(Functions.SOPF.z(mN + 1))) {
        return Z.valueOf(mN);
      }
    }
  }
}
