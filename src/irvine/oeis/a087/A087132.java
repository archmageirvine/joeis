package irvine.oeis.a087;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087132 a(n) is the sum of the squares of the sizes of the conjugacy classes in the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A087132 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= n / i; ++j) {
        final int[] lower = new int[j + 1];
        Arrays.fill(lower, i);
        lower[0] = n - i * j;
        final Z t = Binomial.multinomial(n, lower).multiply(Functions.FACTORIAL.z(i - 1).pow(j)).divide(Functions.FACTORIAL.z(j)).square()
          .multiply(get(n - i * j, i - 1));
        sum = sum.add(t);
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    return mB.get(++mN, mN);
  }
}
