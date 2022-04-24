package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056554 Powerfree kernel of 4th-powerfree part of n.
 * @author Sean A. Irvine
 */
public class A056554 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if ((e & 3) != 0) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
