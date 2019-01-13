package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003124.
 * @author Sean A. Irvine
 */
public class A003124 implements Sequence {

  private long mN = 34;

  @Override
  public Z next() {
    mN = (mN & 1) == 0 ? mN / 2 : 3 * mN - 1;
    return Z.valueOf(mN);
  }
}

