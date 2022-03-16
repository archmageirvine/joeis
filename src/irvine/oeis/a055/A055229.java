package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055229 Greatest common divisor of largest square dividing n and squarefree part of n.
 * @author Sean A. Irvine
 */
public class A055229 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e > 1 && (e & 1) == 1) {
        prod = prod.multiply(p);
      }
    }
    return prod;
  }
}
