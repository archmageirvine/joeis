package irvine.oeis.a079;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079249 Sum of r in all pairs (r,s), 0&lt;=r&lt;s, r+s divides n.
 * @author Sean A. Irvine
 */
public class A079249 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(((d + 1) / 2L) * ((d + 1) / 2L - 1L))).divide2();
  }
}

