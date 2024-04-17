package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063968 Numbers k such that sopf(k) = sopf(k+2), where sopf(k) = A008472(k).
 * @author Sean A. Irvine
 */
public class A063968 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).equals(Functions.SOPF.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}

