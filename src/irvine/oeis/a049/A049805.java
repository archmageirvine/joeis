package irvine.oeis.a049;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006842;

/**
 * A049805 Triangular array T read by rows: T(n,k) is the number of Farey fractions of order n that are &lt;= 1/k for k=1..n, for n&gt;=1.
 * @author Sean A. Irvine
 */
public class A049805 extends A006842 {

  private int mN = 0;
  private int mM = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      super.step();
      mK = 1;
      mM = mTerms.size() - 1;
    }
    final Q t = new Q(1, mK);
    while (mTerms.get(mM).compareTo(t) > 0) {
      --mM;
    }
    return Z.valueOf(mM + 1);
  }
}
