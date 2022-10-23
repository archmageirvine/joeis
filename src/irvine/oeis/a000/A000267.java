package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000267 Integer part of square root of 4n+1.
 * @author Sean A. Irvine
 */
public class A000267 extends Sequence0 {

  private Z mN = Z.THREE.negate();

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.sqrt();
  }
}
