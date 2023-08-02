package irvine.oeis.a246;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A246137 Number of maximal classes determined by elementary Abelian p-groups.
 * @author Sean A. Irvine
 */
public class A246137 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    final Z nf = mF.factorial(++mN - 1);
    final FactorSequence fs = Jaguar.factor(mN);
    final Z[] z = fs.toZArray();
    if (z.length != 1 || Z.ONE.equals(z[0])) {
      return Z.ZERO;
    }
    final Z p = z[0];
    final int e = fs.getExponent(p);
    Z prod = Z.ONE;
    Z t = Z.ONE;
    for (int k = 0; k < e; ++k) {
      t = t.multiply(p);
      prod = prod.multiply(t.subtract(1));
    }
    return nf.divide(prod).divide(p.pow(((long) e * e - e) / 2));
  }
}
