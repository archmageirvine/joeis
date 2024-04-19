package irvine.oeis.a080;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A080510 Triangle read by rows: T(n,k) gives the number of set partitions of {1,...,n} with maximum block length k.
 * @author Georg Fischer
 */
public class A080510 extends Triangle {

  /** Construct the sequence. */
  public A080510() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i) option remember; `if`(n=0, 1, `if`(i<1, 0,
           add(b(n-i*j, i-1) *n!/i!^j/(n-i*j)!/j!, j=0..n/i)))
        end:
    T:= (n, k)-> b(n, k) -b(n, k-1):
    seq(seq(T(n, k), k=1..n), n=1..12);  # _Alois P. Heinz_, Apr 20 2012
  */
  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final int jmax = n / i;
      for (int j = 0; j <= jmax; ++j) {
        sum = sum.add(get(n - i * j, i - 1).multiply(Functions.FACTORIAL.z(n))
          .divide(Functions.FACTORIAL.z(i).pow(j))
          .divide(Functions.FACTORIAL.z(n - i * j))
          .divide(Functions.FACTORIAL.z(j)));
      }
      return sum;
    }
  };

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    return mB.get(n, k).subtract(mB.get(n, k - 1));
  }
}
