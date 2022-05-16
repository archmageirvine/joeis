package irvine.oeis.a052;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.group.PolynomialRing;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A052265 Triangle giving T(n,r) = number of equivalence classes of Boolean functions of n variables and range r=0..2^n under action of symmetric group.
 * @author Sean A. Irvine
 */
public class A052265 extends A052107 {

  // After Andrew Howroyd

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = -1;
  private Z mF = Z.ONE;
  private Polynomial<Z> mRow = RING.onePlusXToTheN(1);

  private Z lcm(final int[] q) {
    Z lcm = Z.ONE;
    for (final int v : q) {
      lcm = lcm.lcm(Z.valueOf(v));
    }
    return lcm;
  }

  private Polynomial<Z> fix(final int[] q) {
    final Z lcm = lcm(q);
    final ArrayList<Z> u = new ArrayList<>();
    final Z[] v = Jaguar.factor(lcm).divisors();
    for (final Z d : v) {
      int w = 0;
      for (final int j : q) {
        final int g = IntegerUtils.gcd(d.intValueExact(), j);
        w += g;
      }
      u.add(Z.ONE.shiftLeft(w));
    }
    Polynomial<Z> prod = RING.one();
    for (int i = 0; i < v.length; ++i) {
      final int t = v[i].intValue();
      int sum = 0;
      for (int j = 0; j <= i; ++j) {
        if (v[i].mod(v[j]).isZero()) {
          final int d = v[i].divide(v[j]).intValueExact();
          final int mu = Mobius.mobius(d);
          sum += mu * u.get(j).intValueExact();
        }
      }
      prod = RING.multiply(prod, RING.pow(RING.onePlusXToTheN(t), sum / t));
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      mM = 0;
      mRow = RING.zero();
      final IntegerPartition part = new IntegerPartition(mN);
      int[] p;
      while ((p = part.next()) != null) {
        mRow = RING.add(mRow, RING.multiply(fix(p), IntegerPartition.permCount(p, 1)));
      }
    }
    return mRow.coeff(mM).divide(mF);
  }
}
