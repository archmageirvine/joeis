package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062509 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(Jaguar.factor(mN).omega());
  }
}
