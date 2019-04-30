package irvine.oeis.a296;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A296170 E.g.f. <code>A(x)</code> satisfies: <code>[x^(n-1)] A(x)^(n^2) = [x^n] A(x)^(n^2)</code> for <code>n&gt;=1</code>.
 * @author Sean A. Irvine
 */
public class A296170 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  protected List<Q> mA = new ArrayList<>();
  {
    mA.add(Q.ONE);
  }
  private int mN = -1;
  private Z mF = Z.ONE;

  protected void stepEgf() {
    final int n = mA.size();
    final Polynomial<Q> v = RING.pow(RING.create(mA), n * n, n);
    mA.add(v.coeff(n - 1).subtract(v.coeff(n)).divide(n * n));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    stepEgf();
    return mA.get(mN).multiply(mF).toZ();
  }
}
