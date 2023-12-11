package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067268 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == Jaguar.factor(mN * mN + 1).omega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

