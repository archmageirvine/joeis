package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064144 a(n) is the number of divisors of n!+1.
 * @author Sean A. Irvine
 */
public class A064144 extends A000142 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next().add(1)).sigma0();
  }
}
