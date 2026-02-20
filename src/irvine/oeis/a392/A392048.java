package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002487;

/**
 * A392048 a(n) is the number of distinct integers that can be created by summing combinations of the n+1 first rationals {b(0)/b(1), ..., b(n)/b(n+1)}, where b(k)=A002487(k) is Stern's diatomic series.
 * @author Sean A. Irvine
 */
public class A392048 extends Sequence0 {

  private final HashSet<Q> mS = new HashSet<>();
  private final Sequence mA = new A002487();
  private Z mQ = mA.next();
  private long mCount = 1;

  {
    mS.add(Q.ZERO);
  }

  @Override
  public Z next() {
    final Z p = mQ;
    mQ = mA.next();
    final Q f = new Q(p, mQ);
    final HashSet<Q> sums = new HashSet<>();
    for (final Q s : mS) {
      sums.add(s.add(f));
    }
    for (final Q s : sums) {
      if (mS.add(s) && s.isInteger()) {
        ++mCount;
      }
    }
    return Z.valueOf(mCount);
  }
}
