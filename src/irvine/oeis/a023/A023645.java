package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023645 a(n) = tau(n)-1 if n is odd or tau(n)-2 if n is even.
 * @author Sean A. Irvine
 */
public class A023645 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(++mN).sigma0().subtract(2 - (mN & 1));
  }
}
