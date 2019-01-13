package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A000264.
 * @author Sean A. Irvine
 */
public class A000264 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private final ArrayList<Z> mV = new ArrayList<>();
  {
    mV.add(null);
  }
  private final MemoryFactorial mF = new MemoryFactorial();
  private Polynomial<Z> mU = RING.zero();
  private int mN = 0;

  private Z u(final int n) {
    final Z t = mF.factorial(n + 1);
    return mF.factorial(2 * n)
      .multiply(mF.factorial(2 * n + 2))
      .divide2()
      .divide(mF.factorial(n))
      .divide(t)
      .divide(t)
      .divide(mF.factorial(n + 2));
  }


  @Override
  public Z next() {
    final Z u = u(++mN);
    mU = RING.add(mU, RING.monomial(u.multiply2(), mN));
    Z v = u;
    for (int k = 1; k < mN; ++k) {
      final Z w = RING.pow(RING.add(mU, RING.one()), 2 * k, mN - k).coeff(mN - k);
      v = v.subtract(w.multiply(mV.get(k)));
    }
    mV.add(v);
    return v;
  }
}
