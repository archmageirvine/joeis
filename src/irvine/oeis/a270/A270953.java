package irvine.oeis.a270;
// manually 2026-10-31/mtripol

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTable;

/**
 * A270953 Number T(n,k) of set partitions of [n] having exactly k pairs (m,m+1) such that m+1 is in some block b and m is in block b+1; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n-floor((1+sqrt(max(0,8n-7)))/2), read by rows.
 * triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n-floor((1+sqrt(max(0,8n-7)))/2), read by rows.
 * @author Georg Fischer
 */
public class A270953 extends LambdaTable implements DirectArray {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected Polynomial<Z> mT; // coefficients yield the row
  private int mColMax; // ending column index
  private int mRow; // current row index
  private int mCol; // current column index

  /** Construct the sequence. */
  public A270953() {
    super(0, 0, n -> new Integer[] {0, 1}, (n, k) -> null); // range will be set dynamically
    mRow = -1; // force row change below
  }

  /* Maple:
      b:= proc(n, i, m) option remember; expand(`if`(n=0, 1, add(
             b(n-1, j, max(m, j))*`if`(j=i-1, x, 1), j=1..m+1)))
          end:
      T:= n-> (p-> seq(coeff(p, x, i), i=0..degree(p)))(b(n, 1, 0)):
      seq(T(n), n=0..14);
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
        sum = RING.add(sum, j == i - 1 ? RING.shift(temp, 1) : temp);
      }
      return sum;
    }
  };

  @Override
  public Z a(final long n, final long k) {
    if (n != mRow) { // row change is necessary
      mRow = (int) n;
      mT = mB.get(mRow, 1, 0);
      mColRange = x -> new Integer[] {0, mT.degree()};
    }
    return mT.coeff(k);
  }

  @Override
  public Z next() {
    while (++mCol > mColMax) {
      ++mRow;
      mT = mB.get(mRow, 1, 0);
      mColRange = x -> new Integer[] {0, mT.degree()};
      final Integer[] range = mColRange.apply(mRow);
      mColMax = range[1];
      mCol = range[0] - 1;
    }
    return a(mRow, mCol);
  }

}
