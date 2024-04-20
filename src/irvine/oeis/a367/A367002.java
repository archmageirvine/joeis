package irvine.oeis.a367;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A367002 a(n) is the smallest prime factor of n*2^n-1.
 * @author Sean A. Irvine
 */
public class A367002 extends A003261 {

  {
    setOffset(2);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
