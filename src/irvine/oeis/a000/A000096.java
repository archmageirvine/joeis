package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000096 a(n) = n*(n+3)/2.
 * @author Sean A. Irvine
 */
public class A000096 extends Sequence0 implements DirectSequence {

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

  @Override
  public Z a(final Z n) {
    return n.multiply(n.add(3)).divide2();
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

