package irvine.oeis.a243;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A243978 Triangle T(n,k), n&gt;>=0, 0&lt;=k&lt;=n, read by rows: T(n,k) is the number of partitions of n where the minimal multiplicity of any part is k.
 * @author Georg Fischer
 */
public class A243978 extends BaseTriangle implements DirectArray {

  /** Construct the sequence. */
  public A243978() {
    super(0, 0, 0);
  }

  /* Maple:
     b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
           b(n, i-1, k) +add(b(n-i*j, i-1, k), j=max(1, k)..n/i)))
         end:
     T:= (n, k)-> b(n$2, k) -`if`(n=0 and k=0, 0, b(n$2, k+1)):
     seq(seq(T(n, k), k=0..n), n=0..14);
  */
  final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      return n == 0
        ? Z.ONE
        : i < 1
        ? Z.ZERO
        : get(n, i - 1, k).add(Integers.SINGLETON.sum(Functions.MAX.i(1, k), n / i, j -> get(n - i * j, i - 1, k)));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, n, k).subtract((n == 0 && k == 0) ? Z.ZERO : mB.get(n, n, k + 1));
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
