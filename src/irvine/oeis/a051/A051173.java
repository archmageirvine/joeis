package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051173 Triangular array T read by rows: T(u,v) = lcm(u,v).
 * @author Sean A. Irvine
 */
public class A051173 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(LongUtils.lcm(mN, mM));
  }
}
