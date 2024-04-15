package irvine.oeis.a060;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A060642 Triangle read by rows: row n lists number of ordered partitions into k parts of partitions of n.
 * @author Georg Fischer
 */
public class A060642 extends Triangle {

  /** Construct the sequence. */
  public A060642() {
    setOffset(1);
    hasRAM(true);
  }

  /* Maple:
    A:= proc(n, k) option remember; `if`(n=0, 1, k*add(
          A(n-j, k)*numtheory[sigma](j), j=1..n)/n)
        end:
    T:= (n, k)-> add(A(n, k-i)*(-1)^i*binomial(k, i), i=0..k):
    seq(seq(T(n, k), k=1..n), n=1..12);  # _Alois P. Heinz_, Mar 12 2015
  */
  private final MemoryFunction2<Integer, Z> mA = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer k) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(get(n - j, k).multiply(Functions.SIGMA.z(j)));
      }
      return sum.multiply(k).divide(n);
    }
  };

  @Override
  public Z compute(int n, int k) {
    ++n;
    ++k;
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(mA.get(n, k - i).multiply(Binomial.binomial(k, i)).multiply(((i & 1) == 0) ? 1 : -1));
    }
    return sum;
  }
}
