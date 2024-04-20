package irvine.oeis.a003;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003021 Largest prime factor of 10^n + 1.
 * @author Sean A. Irvine
 */
public class A003021 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return Functions.GPF.z(mN.add(1));
  }
}
