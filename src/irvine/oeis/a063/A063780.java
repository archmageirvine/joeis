package irvine.oeis.a063;

import java.util.Arrays;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A063780 Numbers k such that there exist sequences a_i, b_i in N (i=1,2,3,4) with 0 &lt; a_1 &lt; a_2 &lt; a_3 &lt; a_4 &lt; k, 0 &lt; b_1 &lt; b_2 &lt; b_3 &lt; b_4 &lt; k and a_i != b_j for all i,j = 1,2,3,4, satisfying both Sum_{i=1..4} a_i = Sum_{i=1..4} b_i = 2*k and Product_{i=1..4} cos(a_i * Pi/(2*k)) = Product_{i=1..4} cos(b_i * Pi/(2*k)).
 * @author Sean A. Irvine
 */
public class A063780 extends Sequence1 {

  // todo does not match definition?

  protected static final int ACCURACY = -500;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 7;

  protected boolean testPrecise(final int n, final int[] a, final int[] b) {
    CR cosA = CR.ONE;
    CR cosB = CR.ONE;
    final CR zn = CR.valueOf(2 * n);
    for (int k = 0; k < a.length; ++k) {
      cosA = cosA.multiply(CR.PI.multiply(a[k]).divide(zn).cos());
      cosB = cosB.multiply(CR.PI.multiply(b[k]).divide(zn).cos());
    }
    return cosA.compareTo(cosB, ACCURACY) == 0;
  }

  protected double trig(final int n, final int[] a) {
    double cos = 1;
    for (final int v : a) {
      cos *= Math.cos((Math.PI * v) / (2 * n));
    }
    return cos;
  }

  private boolean testTrig(final int n, final int[] a, final int[] b) {
    return Math.abs(trig(n, a) - trig(n, b)) < 1e-12 && testPrecise(n, a, b);
  }

  private boolean isOk(final int k, final int[] a) {
    for (final int v : a) {
      if (v == k) {
        return false;
      }
    }
    return true;
  }

  private int countSolutions(final int n, final int[] a, final int remaining, final int[] b, final int bPos) {
    if (bPos == b.length) {
      if (remaining != 0) {
        return 0;
      }
      final boolean res = testTrig(n, a, b);
      if (res && mVerbose) {
        StringUtils.message(n + " " + Arrays.toString(a) + " " + Arrays.toString(b) + " " + trig(n, a));
      }
      return res ? 1 : 0;
    }
    // WLOG b[0] > a[0]
    int cnt = 0;
    for (int k = bPos == 0 ? a[0] + 1 : b[bPos - 1] + 1; remaining - k >= 0; ++k) {
      if (isOk(k, a)) {
        b[bPos] = k;
        cnt += countSolutions(n, a, remaining - k, b, bPos + 1);
      }
    }
    return cnt;
  }

  private int countSolutions(final int n, final int remaining, final int[] a, final int aPos) {
    if (aPos == a.length) {
      if (remaining != 0) {
        return 0;
      }
      return countSolutions(n, a, 2 * n, new int[4], 0);
    }
    int cnt = 0;
    for (int k = aPos == 0 ? 1 : a[aPos - 1] + 1; remaining - k >= 0; ++k) {
      a[aPos] = k;
      cnt += countSolutions(n, remaining - k, a, aPos + 1);
    }
    return cnt;
  }

  private int countSolutions(final int n) {
    return countSolutions(n, 2 * n, new int[4], 0);
  }

  @Override
  public Z next() {
    return Z.valueOf(countSolutions(++mN));
  }
}
