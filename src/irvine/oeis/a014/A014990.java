package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014990 a(n) = (1 - (-8)^n)/9.
 * @author Sean A. Irvine
 */
public class A014990 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-8);
    return Z.ONE.subtract(mT).divide(9);
  }
}
