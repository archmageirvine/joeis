package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032301 Shifts left under "EFJ" (unordered, size, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032301 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    if (m >= 1) {
      for (int j = 0; j <= Math.min(1, n / m); ++j) {
        final int[] t = new int[j + 1];
        Arrays.fill(t, m);
        t[0] = n - m * j;
        sum = sum.add(Binomial.binomial(get(m - 1, m - 1), Z.valueOf(j)).multiply(Binomial.multinomial(n, t)).multiply(get(n - m * j, m - 1)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
