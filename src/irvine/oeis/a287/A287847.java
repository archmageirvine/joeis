package irvine.oeis.a287;
// manually 2026-08-16/mtrifun

import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A287847 Number A(n,k) of Dyck paths of semilength n such that no level has more than k peaks; square array A(n,k), n &gt;= 0, k &gt;= 0, read by descending antidiagonals.
 * square array A(n,k), n &gt;= 0, k &gt;= 0, read by descending antidiagonals.
 * @author Georg Fischer
 */
public class A287847 extends UpperLeftTriangle implements DirectArray {

  /** Construct the sequence. */
  public A287847() {
    super(0, 0, 0, -1);
  }

  /* Maple:
     b:= proc(n, k, j) option remember; `if`(j=n, 1, add(
           b(n-j, k, i)*add(binomial(i, m)*binomial(j-1, i-1-m),
            m=max(0, i-j)..min(k, i-1)), i=1..min(j+k, n-j)))
         end:
     A:= proc(n, k) option remember; `if`(n=0, 1, (m->
           add(b(n, m, j), j=1..m))(min(n, k)))
         end:
     seq(seq(A(n, d-n), n=0..d), d=0..14);
  */
  final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int k, final int j) {
      return
        j == n ? Z.ONE : Integers.SINGLETON.sum(1, Functions.MIN.i(j + k, n - j), i ->
          get(n - j, k, i).multiply(Integers.SINGLETON.sum(Functions.MAX.i(0, i - j), Functions.MIN.i(k, i - 1),
            m -> Binomial.binomial(i, m).multiply(Binomial.binomial(j - 1, i - 1 - m)))));
    }
  };

  final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      final int mink = Functions.MIN.i(n, k);
      return n == 0 ? Z.ONE : Integers.SINGLETON.sum(1, mink, j -> mB.get(n, mink, j));
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k);
  }

  @Override
  public Z a(final long n, final long k) {
    return matrixElement((int) n, (int) k);
  }
}
