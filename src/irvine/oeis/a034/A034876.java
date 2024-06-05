package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a322.A322583;

/**
 * A034876 Number of ways to write n! as a product of smaller factorials each greater than 1.
 * @author Sean A. Irvine
 */
public class A034876 extends A322583 {

  // After Antti Karttunen

  private int mN = 0;

  private long calculate(final Z n, final int m, final int p) {
    if (Z.ONE.equals(n)) {
      return 1;
    }
    long sum = 0;
    for (int k = m; k >= p; --k) {
      final Z f = Functions.FACTORIAL.z(k);
      sum += a(n.divide(f).intValueExact()).longValueExact();
    }
    return sum;
  }

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ZERO : Z.valueOf(calculate(Functions.FACTORIAL.z(mN), mN - 1, Functions.PREV_PRIME.i(mN + 1)));
  }
}
