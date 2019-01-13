package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014989.
 * @author Sean A. Irvine
 */
public class A014989 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-7);
    return Z.ONE.subtract(mT).divide(8);
  }
}
