package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002812 <code>a(n) = 2*a(n-1)^2 - 1</code>, starting <code>a(0)=2</code>.
 * @author Sean A. Irvine
 */
public class A002812 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.square().multiply2().subtract(1);
    }
    return mA;
  }
}

