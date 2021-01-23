package irvine.oeis.a060;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A060640 If n = Product p_i^e_i then a(n) = Product (1 + 2*p_i + 3*p_i^2 + ... + (e_i+1)*p_i^e_i).
 * @author Sean A. Irvine
 */
public class A060640 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      s = s.add(d.multiply(Cheetah.factor(mN / d.longValue()).sigma()));
    }
    return s;
  }
}
