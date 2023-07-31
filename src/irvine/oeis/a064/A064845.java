package irvine.oeis.a064;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064845 Let r_1 = 1; r_{n+1} = [r_1; r_2, r_3,..., r_n]; n-th term is numerator of r_n.
 * @author Sean A. Irvine
 */
public class A064845 extends Sequence1 {

  private final ArrayList<Q> mQ = new ArrayList<>();

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mQ.isEmpty()) {
      mQ.add(Q.ONE);
    } else {
      Q t = mQ.get(mQ.size() - 1);
      for (int k = mQ.size() - 2; k >= 0; --k) {
        t = t.reciprocal().add(mQ.get(k));
      }
      mQ.add(t);
    }
    return select(mQ.get(mQ.size() - 1));
  }
}
