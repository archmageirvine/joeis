package irvine.oeis.a291;

import irvine.math.MemoryFunctionInt3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A291680 Number T(n,k) of permutations p of [n] such that in 0p the largest up-jump equals k and no down-jump is larger than 2; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A291680 extends BaseTriangle implements DirectArray {

  private int mN;

  /** Construct the sequence. */
  public A291680() {
    super(0, 0, 0);
    mN = -1;
  }

  /* Maple:
     b:= proc(u, o, k) option remember; `if`(u+o=0, 1,
           add(b(u-j, o+j-1, k), j=1..min(2, u))+
           add(b(u+j-1, o-j, k), j=1..min(k, o)))
         end:
     T:= (n, k)-> b(0, n, k)-`if`(k=0, 0, b(0, n, k-1)):
     seq(seq(T(n, k), k=0..n), n=0..12);
  */
  final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int u, final int o, final int k) {
      return u + o == 0
        ? Z.ONE
        : Integers.SINGLETON.sum(1, Functions.MIN.i(2, u), j -> get(u - j, o + j - 1, k)).add(
          Integers.SINGLETON.sum(1, Functions.MIN.i(k, o), j -> get(u + j - 1, o - j, k)));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(0, n, k).subtract(k == 0 ? Z.ZERO : mB.get(0, n, k - 1));
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
