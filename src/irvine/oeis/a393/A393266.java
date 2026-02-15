package irvine.oeis.a393;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393266 Totient numbers (A002202) k at which x/y reaches a record, where x (A006511) is the largest integer such that phi(x) = k and y (A002181) is the smallest integer such that phi(y) = k.
 * @author Sean A. Irvine
 */
public class A393266 extends Sequence1 {

  private Q mRecord = Q.ONE;
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      mN = mN.add(2);
      final TreeSet<Z> inv = InverseEuler.inversePhi(mN);
      if (!inv.isEmpty()) {
        final Q ratio = new Q(inv.last(), inv.first());
        if (ratio.compareTo(mRecord) > 0) {
          mRecord = ratio;
          return mN;
        }
      }
    }
  }
}
