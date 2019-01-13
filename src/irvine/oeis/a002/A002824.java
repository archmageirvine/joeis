package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001035;

/**
 * A002824.
 * @author Sean A. Irvine
 */
public class A002824 extends A001035 {

  private long mN = 1;

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(++mN, 2));
  }
}
