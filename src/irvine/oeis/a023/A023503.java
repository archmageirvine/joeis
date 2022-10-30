package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A023503 Greatest prime divisor of prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A023503 extends A065091 {

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z[] t = Jaguar.factor(super.next().subtract(1)).toZArray();
    return t[t.length - 1];
  }
}
