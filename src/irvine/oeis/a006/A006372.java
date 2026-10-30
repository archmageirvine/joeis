package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.partition.PartitionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006372 Numbers of terms in expressions for coefficients of "Lovelock Lagrangians" (or "Gauss-Bonnet forms") in terms of Riemann-Christoffel curvature tensor and two of its contractions (viz., the Ricci curvature tensor and the Riemann curvature scalar) for n-dimensional differentiable manifolds having a general linear connection.
 * @author Sean A. Irvine
 */
public class A006372 extends Sequence0 {

  private int mN = -1;

  private static final class RowTerm {
    private final int[] mInc;
    private final Z mCoeff;

    private RowTerm(final int[] inc, final Z coeff) {
      mInc = inc;
      mCoeff = coeff;
    }
  }

  private static void enumerateRow(final int j,
                                   final int sum, final int[] inc,
                                   final Z coeff, final int[] lambda,
                                   final int[] dx, final int[] dy,
                                   final int[] g,
                                   final List<RowTerm> terms) {
    final int r = lambda.length;
    if (j == r) {
      if (sum == 2) {
        terms.add(new RowTerm(inc.clone(), coeff));
      }
      return;
    }

    for (int k = 0; k <= 2; ++k) {
      final int ex = k * dx[j];
      final int ey = k * dy[j];
      if (sum + ex > 2 || ey > 2) {
        break;
      }

      final Z c;
      if (k == 0) {
        c = Z.ONE;
      } else if (k == 1) {
        c = Z.valueOf(g[j]);
      } else {
        c = Z.valueOf(g[j]).multiply(Z.valueOf(g[j] + 1L)).divide(Z.TWO);
      }

      inc[j] = ey;
      enumerateRow(j + 1, sum + ex, inc, coeff.multiply(c), lambda, dx, dy, g, terms);
      inc[j] = 0;
    }
  }

  private static Z f(final int[] lambda) {
    final int r = lambda.length;

    // Powers of 3 encode the y-exponent vector.
    final int[] pow3 = new int[r + 1];
    pow3[0] = 1;
    for (int j = 0; j < r; ++j) {
      if (pow3[j] > Integer.MAX_VALUE / 3) {
        throw new IllegalArgumentException("Partition too long for dense DP");
      }
      pow3[j + 1] = 3 * pow3[j];
    }
    final int states = pow3[r];

    // Precompute all possible row terms.
    @SuppressWarnings("unchecked")
    final List<RowTerm>[] rows = new List[r];
    for (int i = 0; i < r; ++i) {
      final int[] dx = new int[r];
      final int[] dy = new int[r];
      final int[] g = new int[r];
      for (int j = 0; j < r; ++j) {
        g[j] = Functions.GCD.i(lambda[i], lambda[j]);
        dx[j] = lambda[j] / g[j];
        dy[j] = lambda[i] / g[j];
      }
      rows[i] = new ArrayList<>();
      enumerateRow(0, 0, new int[r], Z.ONE,
        lambda, dx, dy, g, rows[i]);
    }

    Z[] dp = new Z[states];
    dp[0] = Z.ONE;

    for (int i = 0; i < r; ++i) {
      final Z[] next = new Z[states];
      for (int s = 0; s < states; ++s) {
        final Z value = dp[s];
        if (value == null) {
          continue;
        }

        for (final RowTerm term : rows[i]) {
          int t = s;
          boolean valid = true;
          for (int j = 0; j < r; ++j) {
            final int e = term.mInc[j];
            if (e != 0) {
              final int digit = (s / pow3[j]) % 3;
              if (digit + e > 2) {
                valid = false;
                break;
              }
              t += e * pow3[j];
            }
          }
          if (valid) {
            final Z contribution = value.multiply(term.mCoeff);
            next[t] = next[t] == null ? contribution : next[t].add(contribution);
          }
        }
      }
      dp = next;
    }

    int target = 0;
    for (int j = 0; j < r; ++j) {
      target += 2 * pow3[j];
    }
    return dp[target] == null ? Z.ZERO : dp[target];
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Q sum = Q.ZERO;
    final IntegerPartition part = new IntegerPartition(mN);
    int[] p;
    final int[] c = new int[mN + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, c);
      sum = sum.add(new Q(f(p), PartitionUtils.per(c)));
    }
    return sum.toZ();
  }
}
