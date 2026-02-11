package irvine.oeis.a393;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393016 allocated for Vincenzo Librandi.
 * @author Sean A. Irvine
 */
public class A393016 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Q t(final int n, final int m) {
    return new Q(Z.valueOf(n).pow(3).multiply(8L * m), 4L * mN * mN + (long) mM * mM);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return select(t(mN, mM));
  }
}
