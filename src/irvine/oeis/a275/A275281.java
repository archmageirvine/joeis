package irvine.oeis.a275;
// manually 2026-10-31/mtripol

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A275281 Number T(n,k) of set partitions of [n] with symmetric block size list of length k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A275281 extends BaseTriangle implements DirectArray {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mT; // coefficients yield the row
  private int mRow; // current row index

  /** Construct the sequence. */
  public A275281() {
    super(0, 0, 0);
    mRow = -1;
  }

  /* Maple:
      b:= proc(n, s) option remember; expand(`if`(n>s,
            binomial(n-1, n-s-1)*x, 1)+add(binomial(n-1, j-1)*
            b(n-j, s+j)*binomial(s+j-1, j-1), j=1..(n-s)/2)*x^2)
          end:
      T:= n-> (p-> seq(coeff(p, x, i), i=0..n))(b(n, 0)):
      seq(T(n), n=0..12);
  */
  final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int s) {
      Polynomial<Z> sum = (n > s) ? RING.monomial(Binomial.binomial(n - 1, n - s - 1), 1) : RING.one();
      for (int j = 1; j <= (n - s) / 2; ++j) {
        sum = RING.add(sum,
          RING.multiply(RING.monomial(Binomial.binomial(n - 1, j - 1).multiply(Binomial.binomial(s + j - 1, j - 1)), 2)
            , get(n - j, s + j)));
      }
      return sum;
    }
  };

  /**
   * Increase the row index, add a new, empty row and reset the column index.
   * The row length is <code>mRow + 1</code>.
   */
  protected void addRow() {
    super.addRow();
    ++mRow;
    mT = mB.get(mRow, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n != mRow) { // row change is necessary
      mRow = n;
      mT = mB.get(mRow, 0);
    }
    return mT.coeff(k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
