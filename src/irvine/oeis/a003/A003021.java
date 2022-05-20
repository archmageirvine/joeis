package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003021 Largest prime factor of 10^n + 1.
 * @author Sean A. Irvine
 */
public class A003021 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return Jaguar.factor(mN.add(1)).lpf();
  }
}
