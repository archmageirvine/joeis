package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000058 Sylvester's sequence: <code>a(n+1) = a(n)^2 - a(n) + 1</code>, with <code>a(0) = 2</code>.
 * @author Sean A. Irvine
 */
public class A000058 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.TWO;
    } else {
      mN = mN.square().subtract(mN).add(1);
    }
    return mN;
  }
}

