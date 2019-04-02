package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003009 a(n+1) = a(n) + 4^(n-1) a(n)^2.
 * @author Sean A. Irvine
 */
public class A003009 implements Sequence {

  private int mN = 2;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.add(mA.square().shiftLeft(2 * mN - 4));
    }
    return mA;
  }
}

