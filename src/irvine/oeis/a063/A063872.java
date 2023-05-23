package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a025.A025473;

/**
 * A063872 Let m be the n-th positive integer such that phi(m) is divisible by m - phi(m). Then a(n) = phi(m)/(m - phi(m)).
 * @author Sean A. Irvine
 */
public class A063872 extends A025473 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
