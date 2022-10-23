package irvine.oeis.a049;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049455 Triangle read by rows: T(n,k) = numerator of fraction in k-th term of n-th row of variant of Farey series.
 * @author Sean A. Irvine
 */
public class A049455 extends Sequence1 {

  private ArrayList<Q> mA = new ArrayList<>();
  private int mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN >= mA.size()) {
      mN = 0;
      if (mA.isEmpty()) {
        mA.add(Q.ZERO);
        mA.add(Q.ONE);
      } else {
        final ArrayList<Q> next = new ArrayList<>();
        next.add(Q.ZERO);
        for (int k = 1; k < mA.size(); ++k) {
          final Q lo = mA.get(k - 1);
          final Q hi = mA.get(k);
          next.add(new Q(lo.num().add(hi.num()), lo.den().add(hi.den())));
          next.add(hi);
        }
        mA = next;
      }
    }
    return select(mA.get(mN));
  }
}
