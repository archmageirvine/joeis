package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a000.A000295;

/**
 * A016031.
 * @author Sean A. Irvine
 */
public class A016031 extends A000295 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
