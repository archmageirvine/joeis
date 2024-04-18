package irvine.oeis.a087;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087989 a(n) = M(n!), the value of Mertens's function at the n-th factorial.
 * @author Sean A. Irvine
 */
public class A087989 extends Sequence0 {

  private long mF = 1;
  private long mN = -1;

  @Override
  public Z next() {
    if (mN >= 20) {
      throw new UnsupportedOperationException();
    }
    if (++mN > 1) {
      mF *= mN;
    }
    return Z.valueOf(LongUtils.mertens(mF));
  }
}

