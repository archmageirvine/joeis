package irvine.oeis.a060;

import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060307 Number of degree-4n permutations without odd cycles and such that number of cycles of size 2k is even (or zero) for every k.
 * @author Sean A. Irvine
 */
public class A060307 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -4;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
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
      for (int j = 0; j <= n / i; j += 2) {
        if (j == 0 || (i & 1) == 0) {
          final int[] v = new int[j + 1];
          Arrays.fill(v, i);
          v[0] = n - i * j;
          final Z t = Binomial.multinomial(n, v)
            .multiply(mF.factorial(i - 1).pow(j))
            .multiply(get(n - i * j, i - 1))
            .divide(mF.factorial(j));
          sum = sum.add(t);
        }
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    mN += 4;
    return mB.get(mN, mN);
  }
}
