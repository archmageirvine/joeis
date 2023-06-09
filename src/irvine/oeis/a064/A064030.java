package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064030 Product of unitary divisors of n!.
 * @author Sean A. Irvine
 */
public class A064030 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z f = super.next();
    return f.pow(Jaguar.factor(f).unitarySigma0().divide2());
  }
}
