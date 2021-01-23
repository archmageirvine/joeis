package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034865 a(n) = n!*(n-4)/2.
 * @author Sean A. Irvine
 */
public class A034865 implements Sequence {

  private Z mF = Z.THREE;
  private long mN = 3;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(mN - 4);
  }
}
