package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a001.A001221;

/**
 * A007875.
 * @author Sean A. Irvine
 */
public class A007875 extends A001221 {

  @Override
  public Z next() {
    return Z.ONE.max(Z.ONE.shiftLeft(super.next().intValueExact() - 1));
  }
}
