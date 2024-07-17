package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000264 Number of 3-edge-connected rooted cubic maps with 2n nodes and a distinguished Hamiltonian cycle.
 * @author Sean A. Irvine
 */
public class A000264 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mV = new ArrayList<>();
  {
    mV.add(null);
  }
  private Polynomial<Z> mU = RING.zero();
  private int mN = 0;

  private Z u(final int n) {
    final Z t = Functions.FACTORIAL.z(n + 1);
    return Functions.FACTORIAL.z(2 * n)
      .multiply(Functions.FACTORIAL.z(2 * n + 2))
      .divide2()
      .divide(Functions.FACTORIAL.z(n))
      .divide(t)
      .divide(t)
      .divide(Functions.FACTORIAL.z(n + 2));
  }


  @Override
  public Z next() {
    final Z u = u(++mN);
    mU = RING.add(mU, RING.monomial(u.multiply2(), mN));
    Z v = u;
    for (int k = 1; k < mN; ++k) {
      final Z w = RING.pow(RING.add(mU, RING.one()), 2L * k, mN - k).coeff(mN - k);
      v = v.subtract(w.multiply(mV.get(k)));
    }
    mV.add(v);
    return v;
  }
}
