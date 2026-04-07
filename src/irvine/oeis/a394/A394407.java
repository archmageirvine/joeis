package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394407 Positive integers k such that there is no m &lt; k with phi(m)/tau(m) = phi(k)/tau(k).
 * @author Sean A. Irvine
 */
public class A394407 extends Sequence1 {

  private final HashSet<Q> mSeen = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mSeen.add(new Q(Functions.PHI.l(++mN), Functions.SIGMA0.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}

