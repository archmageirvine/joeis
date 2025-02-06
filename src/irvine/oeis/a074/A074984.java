package irvine.oeis.a074;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074984 m^p-n, for smallest m^p&gt;=n.
 * @author Sean A. Irvine
 */
public class A074984 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long m = mN;
    while (!Predicates.POWER.is(m)) {
      ++m;
    }
    return Z.valueOf(m - mN);
  }
}
