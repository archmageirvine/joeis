package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014983.
 * @author Sean A. Irvine
 */
public class A014983 implements Sequence {

  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(-3);
    return Z.ONE.subtract(mT).divide(4);
  }
}
