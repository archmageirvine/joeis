package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062145 Triangle read by rows. T{n, k] = [z^k] P(n, z) where P(n, z) = Sum_{k=0..n} binomial(n, k) * Pochhammer(n - k + c, k) * z^k / k! and c = 4.
 * @author Sean A. Irvine
 */
public class A062145 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private Polynomial<Z> mRow = RING.one();
  private int mN = 0;
  private int mM = -1;
  private final int mAdd;

  protected A062145(final int index) {
    mAdd = index;
  }

  /** Construct the sequence. */
  public A062145() {
    this(3);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mRow = RING.zero();
      for (int k = 0; k <= mN; ++k) {
        final Z c = Binomial.binomial(mN, k).multiply(Functions.FACTORIAL.z(2 * mN + mAdd - k)).divide(Functions.FACTORIAL.z(mN - k));
        mRow = RING.add(mRow, RING.multiply(RING.pow(C, k), c).shift(mN - k));
      }
      mRow = RING.divide(mRow, Functions.FACTORIAL.z(mN + mAdd));
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
