package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A002850.
 * @author Sean A. Irvine
 */
public class A068310 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Jaguar.factor(Z.valueOf(++mN).square().subtract(1)).core();
  }
}

