package irvine.oeis.a242;
// manually 2026-08-17/mtabfun

import irvine.math.MemoryFunctionInt3;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A242352 Number T(n,k) of isoscent sequences of length n with exactly k descents; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n+2-ceiling(2*sqrt(n+1)), read by rows.
 * @author Georg Fischer
 */
public class A242352 extends LambdaTable {

  private boolean mFirst;
  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A242352() {
    super(0, 0, n -> new Integer[] {0, n}, (n, k) -> Z.ZERO);
    mFirst = true;
  }

  final MemoryFunctionInt3<Polynomial<Z>> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i, final int t) {
      return
        n < 1 ? RING.one() : RING.sum(0, t + 1, j -> RING.multiply(get(n - 1, j, t + (j == i ? 1 : 0)), j < i ? RING.x() : RING.one()));
    }
  };

  @Override
  public Z a(final long pn, final long pk) {
    if (mFirst) {
      mFirst = false;
      mColRange = n -> new Integer[] {0, mB.get(n - 1, 0, 0).degree()};
      mLambda = (n, k) -> mB.get(n - 1, 0, 0).coeff(k);
    }
    return super.a(pn, pk);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      mColRange = n -> new Integer[] {0, mB.get(n - 1, 0, 0).degree()};
      mLambda = (n, k) -> mB.get(n - 1, 0, 0).coeff(k);
    }
    return super.next();
  }

}
