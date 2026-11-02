package irvine.oeis.a271;
// manually 2026-10-31/mtripol

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A271466 Number T(n,k) of set partitions of [n] such that k is the largest element of the last block; triangle T(n,k), n&gt;=1, 1&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A271466 extends BaseTriangle implements DirectArray {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mT; // coefficients yield the row
  private int mRow; // current row index

  /** Construct the sequence. */
  public A271466() {
    super(1, 1, 1);
    mRow = -1;
  }

  /* Maple:
     b:= proc(n, m, c) option remember; `if`(n=0, x^c, add(
           b(n-1, max(m, j), `if`(j>=m, n, c)), j=1..m+1))
         end:
     T:= n-> (p-> seq(coeff(p, x, n-i), i=0..n-1))(b(n, 0$2)):
     seq(T(n), n=1..12);
  */
  final MemoryFunctionInt3<Polynomial<Z>> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int m, final int c) {
      if (n == 0) {
        return RING.monomial(Z.ONE, c);
      }
      Polynomial<Z> sum = RING.zero();
      for (int j = 1; j <= m + 1; ++j) {
        sum = RING.add(sum, get(n - 1, m > j ? m : j, j >= m ? n : c));
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
    mT = mB.get(mRow, 0, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n != mRow) { // row change is necessary
      mRow = n;
      mT = mB.get(mRow, 0, 0);
    }
    return mT.coeff(n + 1 - k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
