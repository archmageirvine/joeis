package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a002.A002235;

/**
 * A007505.
 * @author Sean A. Irvine
 */
public class A007505 extends A002235 {

  @Override
  public Z next() {
    return Z.THREE.shiftLeft(super.next().intValueExact()).subtract(1);
  }
}
