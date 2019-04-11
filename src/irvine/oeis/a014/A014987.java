package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014987 <code>a(n) = (1 - (-6)^n)/7</code>.
 * @author Sean A. Irvine
 */
public class A014987 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(-6);
    return Z.ONE.subtract(mT).divide(7);
  }
}
