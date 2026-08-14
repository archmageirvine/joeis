package irvine.oeis.a256;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A256117 Number T(n,k) of partitions of n into parts of exactly k sorts which are introduced in ascending order; triangle T(n,k), n>=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A256117 extends BaseTriangle implements DirectArray {

  private int mN;

  /** Construct the sequence. */
  public A256117() {
    super(0, 0, 0);
    mN = -1;
  }

  /* Maple:
     A:= proc(n, k) option remember; `if`(n=0, 1, k/n*
           add(binomial(2*n, j)*(n-j)*(k-1)^j, j=0..n-1))
         end:
     T:= (n, k)-> add((-1)^i*A(n, k-i)/(i!*(k-i)!), i=0..k):
     seq(seq(T(n, k), k=0..n), n=0..10);  
  */
  final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(0, n - 1, j ->
        Binomial.binomial(2L * n, j).multiply(n - j).multiply(Z.valueOf(k - 1).pow(j))).multiply(k).divide(n);
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return Rationals.SINGLETON.sum(0, k, i -> new Q(mB.get(n, k - i).multiply((i & 1) == 0 ? 1 : -1),
      Functions.FACTORIAL.z(i).multiply(Functions.FACTORIAL.z(k - i)))).num();
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
