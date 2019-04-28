package irvine.oeis.a005;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.BernoulliSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005146 Numerators of numbers occurring in continued fraction connected with expansion of gamma function.
 * @author Sean A. Irvine
 */
public class A005146 implements Sequence {

  // After P. Luschny

  private int mN = 0;
  private final BernoulliSequence mB = new BernoulliSequence(2);
  private final List<Q> mS = new ArrayList<>();
  {
    mS.add(null);
    mS.add(mB.nextQ().divide(2));
  }

  protected Z value(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    ++mN;
    mB.nextQ();
    final Q t = mB.nextQ().divide(2 * mN + 2).divide(2 * mN + 1);
    mS.add((mN & 1) == 0 ? t : t.negate());
    // This could be made incremental with more effort
    final Q[][] m = new Q[mN + 1][mN + 1];
    for (int k = 1; k <= mN; ++k) {
      m[k][1] = Q.ZERO;
    }
    for (int k = 1; k < mN; ++k) {
      m[k][2] = mS.get(k + 1).divide(mS.get(k));
    }
    for (int j = 3; j <= mN; ++j) {
      for (int k = 1; k <= mN - j + 1; ++k) {
        final Q a = m[k + 1][j - 2];
        final Q b = m[k + 1][j - 1];
        final Q c = m[k][j - 1];
        m[k][j] = (j & 1) == 1 ? a.add(b).subtract(c) : a.multiply(b).divide(c);
      }
    }
    if (mN > 0) {
      m[1][1] = mS.get(1);
    }
    return value(m[1][mN]);
  }
}
