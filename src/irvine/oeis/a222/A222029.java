package irvine.oeis.a222;
// manually 2026-08-17/mtabfun

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTable;

/**
 * A222029 Triangle of number of functions in a size n set for which the sequence of composition powers ends in a length k cycle.
 * @author Georg Fischer
 */
public class A222029 extends LambdaTable {

  private boolean mFirst;
  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A222029() {
    super(0, 0, n -> new Integer[] {0, n}, (n, k) -> Z.ZERO);
    mFirst = true;
  }

  /* Maple:
     b:= proc(n, m) option remember; `if`(n=0, x^m, add((j-1)!*
           b(n-j, ilcm(m, j))*binomial(n-1, j-1), j=1..n))
         end:
     T:= n-> (p-> seq(coeff(p, x, i), i=1..degree(p)))(add(
              b(j, 1)*n^(n-j)*binomial(n-1, j-1), j=0..n)):
     seq(T(n), n=0..10);  # Alois P. Heinz, Aug 14 2017
  */
  final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int m) {
      return n == 0 ? RING.pow(RING.x(), m) : RING.sum(1, n, j ->
        RING.multiply(RING.multiply(get(n - j, Functions.LCM.i(m, j)), Functions.FACTORIAL.z(j - 1)), Binomial.binomial(n - 1, j - 1)));
    }
  };

  final MemoryFunction1<Polynomial<Z>> mT = new MemoryFunction1<>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      return RING.sum(0, n, j -> RING.multiply(mB.get(j, 1), Z.valueOf(n).pow(n - j).multiply(Binomial.binomial(n - 1, j - 1))));
    }
  };

  @Override
  public Z a(final long pn, final long pk) {
    if (mFirst) {
      mFirst = false;
      mColRange = n -> new Integer[] {1, mT.get(n).degree()};
      mLambda = (n, k) -> mT.get(n).coeff(k);
    }
    return super.a(pn, pk);
  }

  @Override
  public Z next() {
    if (mFirst) {
      a(0, 0); // force assignament of lambda expressions
    }
    return super.next();
  }

}
