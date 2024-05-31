package irvine.oeis.a267;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A267383 Number A(n,k) of acyclic orientations of the Tur\u00e1n graph T(n,k); square array A(n,k), n&gt;=0, k&gt;=1, read by antidiagonals.
 * @author Georg Fischer
 */
public class A267383 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A267383() {
    super(0, 1, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; local b, l, q; q:=-1;
           l:= [floor(n/k)$(k-irem(n,k)), ceil(n/k)$irem(n,k)];
           b:= proc(n, j) option remember; `if`(j=1, (q-n)^l[1]*
                 mul(q-i, i=0..n-1), add(b(n+m, j-1)*
                 Stirling2(l[j], m), m=0..l[j]))
               end; forget(b);
           abs(b(0, k))
        end:
    seq(seq(A(n, 1+d-n), n=0..d), d=0..14);
  */
  private final MemoryFunctionInt2<Z> mA = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      final int q = -1;
      final int[] l = new int[k + 1];
      l[0] = 0; // not used
      final int floorNk = k > 0 ? n / k : 0; // for safety, k==0 is not used
      final int ceilNk = k > 0 ? (n + k - 1) / k : 0;
      final int irem = k > 0 ? n % k : 0;
      for (int i = 1; i <= k; ++i) {
        l[i] = (i <= k - irem) ? floorNk : ceilNk;
      }
      final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
        @Override
        protected Z compute(final int n, final int j) {
          if (j == 1) {
            return Z.valueOf(q - n).pow(l[1]).multiply(Integers.SINGLETON.product(0, n - 1, i -> Z.valueOf(q - i)));
          }
          return Integers.SINGLETON.sum(0, l[j], m -> get(n + m, j - 1).multiply(Functions.STIRLING2.z(l[j], (long) m)));
        }
      };
      return mB.get(0, k).abs();
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mA.get(n, k);
  }
}
