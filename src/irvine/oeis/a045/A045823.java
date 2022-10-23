package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045823 a(n) = sigma_3(2*n+1).
 * @author Sean A. Irvine
 */
public class A045823 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Jaguar.factor(mN).sigma(3);
  }
}

