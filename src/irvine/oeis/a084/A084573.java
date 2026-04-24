package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084573 Let a(1)=1; for n&gt;1, a(n)=nextprime( a(n-1)^(n/(n-1)) ).
 * @author Sean A. Irvine
 */
public class A084573 extends Sequence1 {

  private long mN = 1;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.NEXT_PRIME.z(CR.valueOf(mA).pow(new Q(++mN, mN - 1)).floor());
    return mA;
  }
}

