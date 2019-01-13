package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014993.
 * @author Sean A. Irvine
 */
public class A014993 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-11);
    return Z.ONE.subtract(mT).divide(12);
  }
}
