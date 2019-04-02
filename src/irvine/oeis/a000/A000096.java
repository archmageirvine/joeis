package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000096 a(n) = n*(n+3)/2.
 * @author Sean A. Irvine
 */
public class A000096 implements Sequence {

  private long mN = 1;
  private Z mZ = null;

  @Override
  public Z next() {
    if (mZ == null) {
      mZ = Z.ZERO;
    } else {
      mZ = mZ.add(++mN);
    }
    return mZ;
  }
}

