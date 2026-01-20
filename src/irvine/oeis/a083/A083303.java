package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083303 Let Pi= sum(k&gt;=0, u(k)/k!) where u(k)&gt;=0 are integer (u(k)=A075874(k)), then sequence gives values of m such that u(m)=0.
 * @author Sean A. Irvine
 */
public class A083303 extends Sequence1 {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mF = mF.multiply(mN);
      }
      if (CR.PI.multiply(mF).frac().compareTo(CR.valueOf(new Q(1, mN + 1))) < 0) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
