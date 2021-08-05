package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A023503 Greatest prime divisor of prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A023503 extends A065091 {

  @Override
  public Z next() {
    final Z[] t = Cheetah.factor(super.next().subtract(1)).toZArray();
    return t[t.length - 1];
  }
}
