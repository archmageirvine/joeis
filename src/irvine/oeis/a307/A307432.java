package irvine.oeis.a307;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;
import irvine.oeis.triangle.DirectArray;

/**
 * A307432 Number T(n,k) of partitions of n into parts whose bitwise AND equals k; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A307432 extends MemoryFunctionInt3Sequence<Polynomial<Z>> implements DirectArray {

  // After Alois P. Heinz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;
  private int mM = 0;

  /* Maple:
     b:= proc(n, i, k) option remember; `if`(n=0, x^k, `if`(i<1, 0,
           b(n, i-1, k)+b(n-i, min(n-i, i), Bits[And](i, k))))
         end:
     T:= n-> (p-> seq(coeff(p, x, i), i=0..n))(
              b(n$2, `if`(n=0, 0, 2^ilog2(2*n)-1))):
     seq(T(n), n=0..14);
  */
  @Override
  protected Polynomial<Z> compute(final int n, final int i, final int k) {
    if (n == 0) {
      return RING.monomial(Z.ONE, k);
    }
    if (i < 1) {
      return RING.zero();
    }
    return RING.add(get(n, i - 1, k), get(n - i, Math.min(n - i, i), i & k));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mN, mN == 0 ? 0 : Integer.highestOneBit(mN) * 2 - 1).coeff(mM);  // 2^ilog2(2*n)-1
  }

  @Override
  public Z a(final long n, final long k) {
    return get((int) n, (int) n, n == 0 ? 0 : Integer.highestOneBit((int) n) * 2 - 1).coeff(k);
  }

}
