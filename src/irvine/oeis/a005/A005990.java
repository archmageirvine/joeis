package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005990 a(n) = (n-1)*(n+1)!/6.
 * @author Sean A. Irvine
 */
public class A005990 implements Sequence {

  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 1);
    return mF.multiply(mN - 1).divide(6);
  }
}
