package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001767 Genus of modular group Gamma(n) = genus of modular curve Chi(n).
 * @author Sean A. Irvine
 */
public class A001767 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN <= 5) {
      return Z.ZERO;
    }
    Z prod = Z.valueOf(mN).square();
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      final Z pp = p.square();
      prod = prod.divide(pp).multiply(pp.subtract(1));
    }
    return prod.multiply(mN - 6).divide(24).add(1);
  }
}
