package irvine.oeis.a087;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.a025.A025586;

/**
 * A087255 Number of different initial values for 3x+1 trajectories of which the largest term appearing during the iteration equals n.
 * @author Sean A. Irvine
 */
public class A087255 extends A025586 {

  private final HashMap<Z, Long> mSeen = new HashMap<>();

  @Override
  public Z next() {
    mSeen.merge(super.next(), 1L, Long::sum);
    final Long res = mSeen.remove(mN);
    return res == null ? Z.ZERO : Z.valueOf(res);
  }
}

