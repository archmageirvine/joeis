package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061526 Number of complete games of n X n tic-tac-toe.
 * @author Sean A. Irvine
 */
public class A061526 extends Sequence1 {

  // After J. Ferry

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = 0;

  // Multinomial coefficients with support for negative indices
   private Z c(final int n, final int... m) {
     Z res = Z.ONE;
     int nn = n;
     for (final int k : m) {
       final Z t;
       if (nn < 0) {
         t = (k & 1) == 0 ? Binomial.binomial(k - nn - 1, k) : Binomial.binomial(k - nn - 1, k).negate();
       } else {
         t = Binomial.binomial(nn, k);
       }
       nn -= k;
       res = res.multiply(t);
     }
    return res;
  }

  // Counts the positions with all n-in-a-rows being x or all o,
  // and with no diagonal n-in-a-rows
  Z bta(final int n, final int p, final int q, final int k) {
    if (4 * Math.max(p, q) < k * (4 * n - k)) {
      return Z.ZERO;
    }
    final int r = n * n - p - q;
    final int nnk = n * (n - k);
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++ i) {
      final Z t = c(n, i).multiply(c(n, k - i));
      sum = sum.add(t.multiply(c(nnk + i * (k - i), q, r).add(c(nnk + i * (k - i), p, r))));
    }
    return sum;
  }

  // Counts the positions with all n-in-a-rows being x or all o,
  // and with the main diagonal being an n-in-a-row (multiply by 2
  // to include positions with other diagonal instead)
  Z btb(final int n, final int p, final int q, final int k) {
    if (4 * Math.max(p, q) < 4 * k * n - (k - 1) * (k + 3)) {
      return Z.ZERO;
    }
    final int r = n * n - p - q;
    final int nnk = n * (n - k);
    Z sum = Z.ZERO;
    for (int i = 0; i < k; ++i) {
      for (int a = 0; a <= Math.min(Math.min(i, k - 1 - i), n); ++a) {
        final int top = nnk + i * (k - 1 - i) + (k - 1) - a;
        final Z t = c(top, q, r).add(c(top, p, r));
        sum = sum.add(c(n, a, i - a, k - 1 - i - a).multiply(t));
      }
    }
    return sum;
  }

  private Z btce(final int n, final int p, final int q, final int k) {
    if (4 * Math.max(p, q) < 4 * k * n - (k - 2) * (k + 6)) {
      return Z.ZERO;
    }
    final int r = n * n - p - q;
    final int nnk = n * (n - k);
    Z sum = Z.ZERO;
    for (int i = 0; i <= k - 2; ++i) {
      for (int a2 = 0; a2 <= Math.min(i / 2, n / 2); ++a2) {
        for (int b1 = 0; b1 <= Math.min(k - 2 - i, 2 * (i - 2 * a2)); ++b1) {
          for (int b2 = 0; b2 <= Math.min(k - 2 - i - b1, 2 * a2); ++b2) {
            final int top = nnk + i * (k - 2 - i) + 2 * (k - 2) - (b1 + 2 * b2);
            final Z t = c(top, q, r).add(c(top, p, r));
            sum = sum.add(t
              .multiply(c(n / 2, i - 2 * a2, a2))
              .multiply(c(2 * (i - 2 * a2), b1))
              .multiply(c(2 * a2, b2))
              .multiply(c(n - 2 * (i - a2), k - 2 - i - b1 - b2))
              .shiftLeft(i - 2L * a2));
          }
        }
      }
    }
    return sum;
  }

  private Z btco(final int n, final int p, final int q, final int k) {
    if (4 * Math.max(p, q) < 4 * k * n - (k - 2) * (k + 6) - 4) {
      return Z.ZERO;
    }
    final int r = n * n - p - q;
    final int nnk = n * (n - k);
    Z sum = Z.ZERO;
    for (int i = 0; i <= k - 2; ++i) {
      for (int a0 = 0; a0 <= 1; ++a0) {
        for (int a2 = 0; a2 <= Math.min((i - a0) / 2, (n - 1) / 2); ++a2) {
          for (int b0 = 0; b0 <= 1; ++b0) {
            for (int b1 = 0; b1 <= Math.min(k - 2 - i - b0, 2 * (i - a0 - 2 * a2)); ++b1) {
              for (int b2 = 0; b2 <= Math.min(k - 2 - i - b0 - b1, 2 * a2); ++b2) {
                final int top = nnk + i * (k - 2 - i) + 2 * (k - 2) - (b1 + 2 * b2) - (a0 + b0 - 1 + a0 * b0);
                final Z t = c(top, q, r).add(c(top, p, r));
                sum = sum.add(t
                  .multiply(c((n - 1) / 2, i - a0 - 2 * a2, a2))
                  .multiply(c(2 * (i - a0 - 2 * a2), b1))
                  .multiply(c(2 * a2, b2))
                  .multiply(c(n - 1 - 2 * (i - a0 - a2), k - 2 - i - b0 - b1 - b2))
                  .shiftLeft(i - a0 - 2L * a2));
              }
            }
          }
        }
      }
    }
    return sum;
  }

  // Counts the positions with all n-in-a-rows being x or all o,
  // and with both diagonals being an n-in-a-row
  Z btc(final int n, final int p, final int q, final int k) {
    return (n & 1) == 0 ? btce(n, p, q, k) : btco(n, p, q, k);
  }

  // Counts the positions with both x and o n-in-a-rows occurring,
  // and occurring as columns (multiply by 2 to include rows)
  Z btd(final int n, final int p, final int q, final int k) {
    return p + q < k * n
      ? Z.ZERO
      : Integers.SINGLETON.sum(1, k - 1, i -> c(n, i, k - i).multiply(c(n * (n - k), p - i * n, q - (k - i) * n)));
  }

  // Counts the positions with main diagonal an x n-in-a-row; the
  // other, an o n-in-a-row (multiply by 2 to include the vice-versa)
  private Z bte(final int n, final int p, final int q, final int k) {
    return k != 2 || (n & 1) == 1
      ? Z.ZERO
      : c(n * (n - 2), p - n, q - n);
  }

  // The number of board positions for each possible
  // placement of k n-in-a-rows (p = # of x's, q = # of o's).
  // Note that positions with more than k n-in-a-rows are not
  // merely included, but multiply included
  private Z bt(final int n, final int p, final int q, final int k) {
    if (k == 0) {
      return c(n * n, p, q);
    }
    final Z t = btb(n, p, q, k).add(btd(n, p, q, k)).add(bte(n, p, q, k));
    return bta(n, p, q, k).add(btc(n, p, q, k)).add(t.multiply2());
  }

  // The number of board positions with p x's and q o's with exactly k n-in-a-rows
  private Z bp(final int n, final int p, final int q, final int k) {
    Z sum = Z.ZERO;
    for (int j = k; j <= 2 * n + 2; ++j) {
      sum = sum.signedAdd(((j - k) & 1) == 0, c(j, k).multiply(bt(n, p, q, j)));
    }
    return sum;
  }

  // The number of dumb games that had p x's, q o's and k n-in-a-rows at some point.
  private Z dg(final int n, final int p, final int q, final int k) {
    return Functions.FACTORIAL.z(n * n - p - q).multiply(Functions.FACTORIAL.z(p)).multiply(Functions.FACTORIAL.z(q)).multiply(bp(n, p, q, k));
  }

  private Z dg(final int n, final int p, final int q) {
    return dg(n, p, q, 0);
  }

  // The number of dumb games won on x's t^th move.
  private Z dgxt(final int n, final int t) {
    return dg(n, t - 1, t - 1).subtract(dg(n, t, t - 1));
  }

  // The number of dumb games won on o's t^th move.
  private Z dgot(final int n, final int t) {
    return dg(n, t, t - 1).subtract(dg(n, t, t));
  }

  // The number of games won on x's t^th move.
  private Z gxt(final int n, final int t) {
    return dgxt(n, t).divide(Functions.FACTORIAL.z(n * n - (2 * t - 1)));
  }

  // The number of games won on o's t^th move.
  private Z got(final int n, final int t) {
    return dgot(n, t).divide(Functions.FACTORIAL.z(n * n - 2 * t));
  }

  // The number of games of n x n tic-tac-toe won by x
  protected Z gx(final int n) {
    return Integers.SINGLETON.sum(n, (n * n + 1) / 2, t -> gxt(n, t));
  }

  // The number of games of n x n tic-tac-toe won by o
  protected Z go(final int n) {
    return Integers.SINGLETON.sum(n, (n * n) / 2, t -> got(n, t));
  }

  // The number of games of n x n tic-tac-toe that end in a draw
  protected Z gc(final int n) {
    return dg(n, (n * n + 1) / 2, (n * n) / 2);
  }

  private Z g(final int n) {
    return gx(n).add(go(n)).add(gc(n));
  }

  @Override
  public Z next() {
    return g(++mN);
  }
}
