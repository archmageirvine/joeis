package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000215;

/**
 * A060377 Pepin's test numbers.
 * @author Sean A. Irvine
 */
public class A060377 extends A000215 {

  @Override
  public Z next() {
    return Z.THREE.pow(super.next().subtract(1).divide2());
  }
}
