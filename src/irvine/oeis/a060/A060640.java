package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060640 If n = Product p_i^e_i then a(n) = Product (1 + 2*p_i + 3*p_i^2 + ... + (e_i+1)*p_i^e_i).
 * @author Sean A. Irvine
 */
public class A060640 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      s = s.add(d.multiply(Functions.SIGMA.z(mN / d.longValue())));
    }
    return s;
  }
}
