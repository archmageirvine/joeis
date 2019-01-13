package irvine.oeis.a175;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A175951.
 * @author Sean A. Irvine
 */
public class A175951 implements Sequence {

  private long mS = 0;
  private HashSet<Q> mA = new HashSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ZERO);
      return Z.ONE;
    }
    final Q s = new Q(1, ++mS);
    final HashSet<Q> uniq = new HashSet<>();
    for (final Q t : mA) {
      uniq.add(t.subtract(s));
      uniq.add(t.add(s));
    }
    mA = uniq;
    return Z.valueOf(mA.size());
  }
}

