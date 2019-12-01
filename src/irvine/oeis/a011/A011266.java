package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011266 <code>a(n) = 2^(n*(n-1)/2)*n!</code>.
 * @author Sean A. Irvine
 */
public class A011266 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(mN).shiftLeft(mN - 1);
    }
    return mA;
  }
}

