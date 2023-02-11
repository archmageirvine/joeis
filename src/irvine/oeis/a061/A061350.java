package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061350 Maximal size of Aut(G) where G is a finite Abelian group of order n.
 * @author Sean A. Irvine
 */
public class A061350 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final Z pe = p.pow(e);
      for (Z s = Z.ONE; s.compareTo(pe) < 0; s = s.multiply(p)) {
        prod = prod.multiply(pe.subtract(s));
      }
    }
    return prod;
  }
}

