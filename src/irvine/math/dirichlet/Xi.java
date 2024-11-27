package irvine.math.dirichlet;

import irvine.factor.factor.Jaguar;
import irvine.math.MemoryFunction2;
import irvine.math.z.Z;

/**
 * Dirichlet series for the product <code>prod(1-1/k^s, k>=2)</code>
 * @author Sean A. Irvine
 */
class Xi extends AbstractDs {

  private final MemoryFunction2<Z, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Z n, final Z m) {
      if (Z.ONE.equals(n)) {
        return Z.ONE;
      }
      Z t = n.compareTo(m) > 0 ? Z.ZERO : Z.NEG_ONE;
      if (n.isProbablePrime()) {
        return t;
      }
      for (final Z d : Jaguar.factor(n).divisors()) {
        if (d.compareTo(m) <= 0 && !d.equals(Z.ONE) && !d.equals(n)) {
          t = t.add(Z.NEG_ONE.multiply(get(n.divide(d), d.subtract(1))));
        }
      }
      return t;
    }
  };

  @Override
  public Z coeff(final Z n) {
    return mB.get(n, n);
  }
}
