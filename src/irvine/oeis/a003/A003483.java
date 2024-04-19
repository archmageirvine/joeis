package irvine.oeis.a003;

import java.util.Arrays;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A003483 Number of square permutations of n elements.
 * @author Sean A. Irvine
 */
public class A003483 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer i) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      if ((i & 1) == 1 || (j & 1) == 0) {
        final int[] indices = new int[j + 1];
        indices[0] = n - i * j;
        Arrays.fill(indices, 1, indices.length, i);
        final Z m = Binomial.multinomial(n, indices);
        s = s.add(Functions.FACTORIAL.z(i - 1).pow(j).multiply(m).divide(Functions.FACTORIAL.z(j)).multiply(get(n - i * j, i - 1)));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN);
  }

}
