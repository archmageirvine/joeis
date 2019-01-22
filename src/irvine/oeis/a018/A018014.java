package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018014.
 * @author Sean A. Irvine
 */
public class A018014 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(13);
    return mN.root(3).add(mN.auxiliary() == 1 ? 0 : 1);
  }
}

