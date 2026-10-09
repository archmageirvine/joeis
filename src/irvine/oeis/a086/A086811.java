package irvine.oeis.a086;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086811 Average (scaled by a certain explicit factor) over all integers k of a_k(n), the n-th coefficient of the k-th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A086811 extends Sequence0 {

  private int mN = 0;

  private static List<Integer> primesUpTo(final int n) {
    final List<Integer> primes = new ArrayList<>();
    for (int p = 2; p <= n; ++p) {
      if (Predicates.PRIME.is(p)) {
        primes.add(p);
      }
    }
    return primes;
  }

  // Coefficient of x^k in Product_{j|d, 1<=j<=k} (1-x^j)^mobius(d/j).
  private static Z coefficient(final Z d, final int k) {
    final Z[] a = new Z[k + 1];
    Arrays.fill(a, Z.ZERO);
    a[0] = Z.ONE;
    for (int j = 1; j <= k; ++j) {
      final Z bj = Z.valueOf(j);
      if (!d.mod(bj).isZero()) {
        continue;
      }
      final int mu = Functions.MOBIUS.i(d.divide(bj));
      if (mu == 1) {
        for (int i = k; i >= j; --i) {
          a[i] = a[i].subtract(a[i - j]);
        }
      } else if (mu == -1) {
        for (int i = j; i <= k; ++i) {
          a[i] = a[i].add(a[i - j]);
        }
      }
    }
    return a[k];
  }

  private static void addDivisors(final int pos, final List<Integer> primes, final int[] exponents, final Z current, final List<Z> divisors) {
    if (pos == primes.size()) {
      divisors.add(current);
      return;
    }
    final Z p = Z.valueOf(primes.get(pos));
    Z power = Z.ONE;
    for (int e = 0; e <= exponents[pos]; ++e) {
      addDivisors(pos + 1, primes, exponents, current.multiply(power), divisors);
      power = power.multiply(p);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final List<Integer> basePrimes = primesUpTo(mN);

    int q = mN + 1;
    while (!Predicates.PRIME.is(q)) {
      ++q;
    }

    // v = k * product of all primes <= k.
    Z v = Z.valueOf(mN);
    final int[] exponents = new int[basePrimes.size()];

    for (int i = 0; i < basePrimes.size(); ++i) {
      final int p = basePrimes.get(i);
      int e = 0;
      int t = mN;
      while (t % p == 0) {
        ++e;
        t /= p;
      }
      exponents[i] = e + 1;
      v = v.multiply(Z.valueOf(p));
    }

    final List<Z> divisors = new ArrayList<>();
    addDivisors(0, basePrimes, exponents, Z.ONE, divisors);

    Q te = Q.ZERO;
    final Z bq = Z.valueOf(q);
    for (final Z d : divisors) {
      te = te.add(new Q(coefficient(d, mN), d));
      te = te.add(new Q(coefficient(bq.multiply(d), mN), d));
    }
    // z/w = v, so the answer is te*v/2.
    final Q answer = te.multiply(new Q(v)).divide(Z.TWO);
    return answer.toZ();
  }
}
