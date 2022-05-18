package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056552 Powerfree kernel of cubefree part of n.
 * @author Sean A. Irvine
 */
public class A056552 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e % 3 != 0) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
