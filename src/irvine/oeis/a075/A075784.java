package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075565.
 * @author Sean A. Irvine
 */
public class A075784 extends Sequence1 {

  private long mN = 23155;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.z(++mN).equals(Functions.SOPF.z(mN - 1).add(Functions.SOPF.z(mN - 2)).add(Functions.SOPF.z(mN - 3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

