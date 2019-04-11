package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014994 <code>a(n) = (1 - (-12)^n)/13</code>.
 * @author Sean A. Irvine
 */
public class A014994 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-12);
    return Z.ONE.subtract(mT).divide(13);
  }
}
