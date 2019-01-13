package irvine.oeis;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A122998.
 * @author Sean A. Irvine
 */
public final class A122998 {

  private A122998() { }

  private static String expand(Q v, final int n) {
    final StringBuilder sb = new StringBuilder();
    Z q = v.toZ();
    sb.append(q).append('.');
    for (int k = 0; k < n; ++k) {
      v = v.subtract(q);
      v = v.multiply(10);
      q = v.toZ();
      final String qs = q.toString();
      if (qs.length() != 1) {
        throw new RuntimeException();
      }
      sb.append(qs);
    }
    return sb.toString();
  }

  /**
   * Direct.
   *
   * @param args number to test
   */
  public static void main(final String[] args) {
    final Fast prime = new Fast();
    Z sumComposites = Z.ZERO;
    Q sum = Q.ZERO;
    long n = 0;
    while (true) {
      if (++n % 100 == 0) {
        System.out.println(n + " " + expand(sum, 30));
      }
      if (!prime.isPrime(n)) {
        sumComposites = sumComposites.add(n);
        sum = sum.add(new Q(Z.ONE, sumComposites));
      }
    }
  }
}

