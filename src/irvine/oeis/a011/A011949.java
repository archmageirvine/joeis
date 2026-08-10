package irvine.oeis.a011;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011949 Number of Barlow packings with group P6(bar)m2 that repeat after 2n layers.
 * @author Sean A. Irvine
 */
public class A011949 extends Sequence1 {

  private final ArrayList<Z> mT4 = new ArrayList<>();
  private int mN = 0;

  /**
   * T1(N), the exact G^(1)(N) contribution.
   */
  private Z t1(final int n) {
    if ((n & 3) != 0) {
      return Z.ZERO;
    }
    final int m = n / 4;
    Z sum = Z.ZERO;
    for (int d = 1; d <= m; ++d) {
      if (m % d == 0 && (d & 1) != 0) {
        sum = sum.add(Z.ONE.shiftLeft(m / d - 1).multiply(Functions.MOBIUS.i(d)));
      }
    }
    return sum;
  }

  /**
   * T2(N), the exact G^(2)(N) contribution.
   * Here N = 2m with m odd.
   */
  private Z t2(final int n) {
    if ((n & 3) != 2) {
      return Z.ZERO;
    }
    final int m = n / 2;
    Z sum = Z.ZERO;
    for (int d = 1; d <= m; ++d) {
      if (m % d == 0) {
        sum = sum.add(
          Z.ONE.shiftLeft((d - 1) / 2)
            .multiply(Functions.MOBIUS.i(m / d)));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    final int n = 2 * mN;

    // f4(n) = 2^(n/2) = 2^mN.
    Z sum = Z.ONE.shiftLeft(mN);

    // Subtract the 2*T1(d) and 2*T2(d) contributions.
    for (int d = 1; d <= n; ++d) {
      if (n % d == 0) {
        sum = sum.subtract(t1(d).multiply2());
        sum = sum.subtract(t2(d).multiply2());
      }
    }

    // Subtract 4*T4(d) for proper divisors d of n.
    for (int d = 2; d < n; d += 2) {
      if (n % d == 0) {
        sum = sum.subtract(mT4.get(d / 2 - 1).multiply(4));
      }
    }

    final Z result = sum.divide(4);
    mT4.add(result);
    return result;
  }
}
