package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.a001.A001316;

/**
 * A105321 Convolution of binomial(1,n) and Gould's sequence A001316.
 * @author Sean A. Irvine
 */
public class A105321 extends A001316 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.add(t);
  }
}
