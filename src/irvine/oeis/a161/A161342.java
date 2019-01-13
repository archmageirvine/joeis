package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A161342.
 * @author Sean A. Irvine
 */
public class A161342 extends A000120 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    final Z r = mPrev;
    final Z p = super.next();
    if (p.bitLength() > 30) {
      throw new UnsupportedOperationException();
    }
    mPrev = mPrev.add(Z.SEVEN.pow(p.intValue()));
    return r;
  }
}

