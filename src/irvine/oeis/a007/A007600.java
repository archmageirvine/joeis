package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007600 Minimal number of subsets in a separating family for a set of n elements.
 * @author Sean A. Irvine
 */
public class A007600 implements Sequence {

  private long mN = 0;

  private Z t(final long n, final int p) {
    return CR.valueOf(new Q(n, 1L << p)).log().divide(CR.THREE.log()).ceil(32).multiply(3).add(2L * p);
  }

  @Override
  public Z next() {
    ++mN;
    return t(mN, 0).min(t(mN, 1)).min(t(mN, 2));
  }
}
