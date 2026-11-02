package irvine.oeis.a185;
// manually 2026-10-31/mtripol

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A185982 Triangle read by rows: number of set partitions of n elements with k connectors, 0&lt;=k&lt;n.
 * @author Georg Fischer
 */
public class A185982 extends BaseTriangle implements DirectArray {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mT; // coefficients yield the row
  private int mRow; // current row index

  /** Construct the sequence. */
  public A185982() {
    super(1, 1, 0);
    mRow = -1;
  }

  /* Maple:
    b:= proc(n, i, m) option remember; `if`(n=0, 1, add(expand(
           b(n-1, j, max(m, j))*`if`(j=i+1, x, 1)), j=1..m+1))
        end:
    T:= n-> (p-> seq(coeff(p, x, i), i=0..n-1))(b(n, 1, 0)):
    seq(T(n), n=1..12);  # Alois P. Heinz, Mar 25 2016
  */
  final MemoryFunctionInt3<Polynomial<Z>> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i, final int m) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      for (int j = 1; j <= m + 1; ++j) {
        final Polynomial<Z> temp = get(n - 1, j, m > j ? m : j);
        sum = RING.add(sum, j == i + 1 ? RING.shift(temp, 1) : temp);
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
    mT = mB.get(mRow, 1, 0);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    if (n != mRow) { // row change is necessary
      mRow = n;
      mT = mB.get(mRow, 1, 0);
    }
    return mT.coeff(k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
