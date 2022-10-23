package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007238 Length of longest chain of subgroups in S_n.
 * @author Sean A. Irvine
 */
public class A007238 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((3 * mN + 1) / 2 - Long.bitCount(mN) - 1);
  }
}
