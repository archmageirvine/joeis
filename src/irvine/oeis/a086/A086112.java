package irvine.oeis.a086;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086112 Denominator of the mean deviation of a discrete uniform distribution on n elements.
 * @author Sean A. Irvine
 */
public class A086112 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? new Q(mN, 4).den() : new Q(mN * mN - 1, 4 * mN).den();
  }
}

