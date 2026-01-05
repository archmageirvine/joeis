package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002487;

/**
 * A392048 allocated for Frederik G. Faye.
 * @author Sean A. Irvine
 */
public class A392048 extends Sequence1 {

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
