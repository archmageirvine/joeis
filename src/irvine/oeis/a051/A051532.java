package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051532 The abelian orders (or abelian numbers): n such that every group of order n is abelian.
 * @author Sean A. Irvine
 */
public class A051532 extends Sequence1 {

  // After Charles R Greathouse IV

  private long mN = 0;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] p = fs.toZArray();
    final Z[] v = new Z[p.length];
    for (int k = 0; k < p .length; ++k) {
      if (fs.getExponent(p[k]) > 2) {
        return false;
      }
      v[k] = p[k].pow(fs.getExponent(p[k]));
    }
    for (int i = 0; i < v.length; ++i) {
      for (int j = i + 1; j < v.length; ++j) {
        if (v[i].mod(p[j]).equals(Z.ONE) || v[j].mod(p[i]).equals(Z.ONE)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
