package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001056 <code>a(n) = a(n-1)*a(n-2) + 1, a(0) = 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A001056 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mA.multiply(mB).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
