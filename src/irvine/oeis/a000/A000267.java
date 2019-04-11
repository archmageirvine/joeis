package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000267 Integer part of square root of <code>4n+1</code>.
 * @author Sean A. Irvine
 */
public class A000267 implements Sequence {

  private Z mN = Z.THREE.negate();

  @Override
  public Z next() {
    mN = mN.add(4);
    return mN.sqrt();
  }
}
