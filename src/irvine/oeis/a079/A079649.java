package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079649 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.FACTORIAL.z(++mN).add(mN * mN + mN + 1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

