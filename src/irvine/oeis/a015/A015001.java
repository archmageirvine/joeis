package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015001 q-factorial numbers for q=3.
 * @author Sean A. Irvine
 */
public class A015001 implements Sequence {

  private Z mT = Z.ONE;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(3);
    mA = mA.multiply(mT.subtract(1)).divide2();
    return mA;
  }
}
