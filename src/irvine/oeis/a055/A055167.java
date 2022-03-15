package irvine.oeis.a055;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055167 Number of optimal binary prefix-free codes with n words all ending in 1.
 * @author Sean A. Irvine
 */
public class A055167 extends MemoryFunctionInt3<Z> implements Sequence {

  private int mN = 0;

  @Override
  protected Z compute(final int n, final int a, final int b) {
    //System.out.println(n + " " + a + " " + b);
    if (1 <= n && n <= 4) {
      return a == 1 && b == 1 ? Z.ONE : Z.ZERO;
    }
    if (b == 1 && a >= 1) {
      Z sum = Z.ZERO;
      for (int k = a & 1; k <= a; k += 2) {
        sum = sum.add(get(n - 1, k, a));
      }
      return sum;
    }
    if (2 <= b && b <= a) {
      return get(n - 1, a, b - 1);
    }
    if (b - a >= 2 && ((b - a) & 1) == 0 && a >= 0) {
      return get(n - 1, a, b - 1);
    }
    if (b - a >= 1 && ((b - a) & 1) == 1 && a >= 0) {
      return get(n - 1, a + 1, b);
    }
    return Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mN <= 3) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int a = 0; a <= mN / 3; ++a) {
      for (int b = 0; b <= mN / 3; ++b) {
        sum = sum.add(get(mN, a, b));
      }
    }
    return sum;
  }
}
