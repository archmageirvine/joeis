package irvine.oeis.a054;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054651 Triangle T(n,k) read by rows giving coefficients in expansion of n! * Sum_{i=0..n} C(x,i) in descending powers of x.
 * @author Sean A. Irvine
 */
public class A054651 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final MemoryFactorial mF = new MemoryFactorial();
  private Polynomial<Z> mA = null;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      mA = RING.zero();
      Polynomial<Z> b = RING.one();
      for (int k = 0; k <= mN; ++k) {
        if (k > 0) {
          b = RING.multiply(b, Polynomial.create(1 - k, 1));
        }
        mA = RING.add(mA, RING.multiply(b, mF.factorial(mN).divide(mF.factorial(k))));
      }
    }
    return mA.coeff(mM);
  }
}
