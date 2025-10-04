package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080870 a(n+1) is smallest number with a(n+1)^n &gt; (a(n)+1)^(n+1), with a(1)=1.
 * @author Sean A. Irvine
 */
public class A080870 extends Sequence1 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = CR.valueOf(mA.add(1)).pow(new Q(mN + 1, mN)).floor().add(1);
    }
    return mA;
  }
}

